package com.bill.blog.service

import com.bill.blog.dto.ConfigDto

/**
 * @author Bill.Lin on 2021/10/5
 */
interface ConfigService {

    fun update(configDto: ConfigDto): Boolean

    fun getAll(): Map<String, String>
}