package com.bill.blog.service

import com.bill.blog.dto.LinkDto

/**
 * @author Bill.Lin on 2021/10/5
 */
interface LinkService {

//    fun getPage()

    fun getAll(): List<LinkDto>

    fun get(id: Int?): LinkDto

    fun add(linkDto: LinkDto): Boolean

    fun update(linkDto: LinkDto): Boolean

    fun delete(ids: List<Long>): Boolean

}