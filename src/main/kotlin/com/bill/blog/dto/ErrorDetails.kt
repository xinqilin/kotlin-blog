package com.bill.blog.dto

import java.util.*

/**
 * @author Bill.Lin on 2021/10/2
 */
class ErrorDetails {

    private var timestamp: Date? = null
    private var message: String? = null
    private var details: String? = null

    fun ErrorDetails(timestamp: Date?, message: String?, details: String?) {
        this.timestamp = timestamp
        this.message = message
        this.details = details
    }

    fun getTimestamp(): Date? {
        return timestamp
    }

    fun getMessage(): String? {
        return message
    }

    fun getDetails(): String? {
        return details
    }
}