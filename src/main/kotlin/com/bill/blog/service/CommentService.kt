package com.bill.blog.service

import com.bill.blog.dto.CommentDto

/**
 * @author Bill.Lin on 2021/10/5
 */
interface CommentService {

    fun add(commentDto: CommentDto): Boolean

//    評論總數
//    fun getCommentPage()

    //    批次審核
    fun checkDone(ids: List<Long>): Boolean

    fun delete(ids: List<Long>): Boolean

    fun reply(id: Long, replyBody: String): Boolean
}