package com.bill.blog.exception

import org.springframework.http.HttpStatus
import java.lang.RuntimeException

/**
 * @author Bill.Lin on 2021/10/2
 */
class BlogException : RuntimeException() {

    private lateinit var status: HttpStatus
    private lateinit var message: String

    fun BlogException(status: HttpStatus, message: String) {
        this.status = status;
        this.message = message;
    }

    fun BlogException(message: String, status: HttpStatus, message1: String) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    fun getStatus(): HttpStatus {
        return status;
    }

    @Override
    fun getMessage(): String {
        return message;
    }
}