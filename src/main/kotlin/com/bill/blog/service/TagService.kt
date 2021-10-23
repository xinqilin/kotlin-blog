package com.bill.blog.service

import com.bill.blog.dto.TagDto

/**
 * @author Bill.Lin on 2021/10/5
 */
interface TagService {

//    fun getTagePage()

    fun getTotals(): Int

    fun add(tagDto: TagDto): Boolean

    fun delete(ids: List<Int>): Boolean
}
