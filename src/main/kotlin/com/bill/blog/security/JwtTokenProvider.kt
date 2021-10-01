package com.bill.blog.security

import com.bill.blog.exception.BlogException
import io.jsonwebtoken.*
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Component
import java.security.SignatureException
import java.util.*

/**
 * @author Bill.Lin on 2021/10/2
 */
@Component
class JwtTokenProvider {

    @Value("${app.jwt.secret}")
    val jwtSecret: String = ""

    @Value("${app.jwt.expiration.milliseconds}")
    val jwtExpirationInMs: Int = 0

    // generate token
    fun generateToken(authentication: Authentication): String {
        val username = authentication.name
        val currentDate = Date()
        val expireDate = Date(currentDate.time + jwtExpirationInMs);

        val token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(Date())
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
        return token;
    }

    // get username from the token
    fun getUsernameFromJWT(token: String): String {
        val claims = Jwts.parser()
                .setSigningKey(jwtSecret)
                .parseClaimsJws(token)
                .body;
        return claims.subject;
    }

    // validate JWT token
    fun validateToken(token: String?): Boolean {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
            return true;
        } catch (ex: SignatureException) {
            throw  BlogException(HttpStatus.BAD_REQUEST, "Invalid JWT signature");
        } catch (ex: MalformedJwtException) {
            throw  BlogException(HttpStatus.BAD_REQUEST, "Invalid JWT token");
        } catch (ex: ExpiredJwtException) {
            throw  BlogException(HttpStatus.BAD_REQUEST, "Expired JWT token");
        } catch (ex: UnsupportedJwtException) {
            throw  BlogException(HttpStatus.BAD_REQUEST, "Unsupported JWT token");
        } catch (ex: IllegalArgumentException) {
            throw  BlogException(HttpStatus.BAD_REQUEST, "JWT claims string is empty.");
        }
    }
}