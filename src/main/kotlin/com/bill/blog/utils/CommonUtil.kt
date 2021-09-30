package com.bill.blog.utils

import com.google.common.base.Strings
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.security.SecureRandom
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.experimental.and

/**
 * @author Bill.Lin on 2021/9/30
 */
class CommonUtil {

    val EMAIL_VALIDATOR = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE)

    val PASSWORD_PATTERN = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$")

    val MAC_VALIDATE_PATTERN = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$"

    fun validateEmail(email: String?): Boolean {
        if (Strings.isNullOrEmpty(email)) {
            return false
        }
        val matcher: Matcher = EMAIL_VALIDATOR.matcher(email)
        return matcher.find()
    }

    fun validatePasswordStrength(password: String?): Boolean {
        if (Strings.isNullOrEmpty(password)) {
            return false
        }
        val matcher: Matcher = PASSWORD_PATTERN.matcher(password)
        return matcher.find()
    }

    fun validateMac(mac: String?): Boolean {
        val p = Pattern.compile(MAC_VALIDATE_PATTERN)
        val m = p.matcher(mac)
        return m.matches()
    }

    fun genSaltKey(): String? {
        val rand = SecureRandom()
        val randomNum = rand.nextInt(99999999 - 10000000) + 10000000
        return Integer.toString(randomNum)
    }

    fun getSha256Hash(data: String, adminId: String): String? {
        val key = "&$@G80689917J@$($adminId"
        val key1 = key.substring(key.length / 2)
        val key2 = key.substring(0, key.length / 2)
        val src = key1 + data + key2
        return try {
            val shaCode = MessageDigest.getInstance("SHA-256")
            shaCode.update(src.toByteArray())
            byte2Hex(shaCode.digest())
        } catch (e: NoSuchAlgorithmException) {
            e.printStackTrace()
            ""
        }
    }

    private fun byte2Hex(data: ByteArray): String? {
        val hex = StringBuilder()
        for (b in data) {
            val tmp = Integer.toHexString((b and 0XFF.toByte()).toInt())
            if (tmp.length == 1) {
                hex.append("0")
            }
            hex.append(tmp)
        }
        return hex.toString().toUpperCase()
    }
}