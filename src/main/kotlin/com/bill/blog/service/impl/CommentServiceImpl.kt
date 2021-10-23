package com.bill.blog.service.impl

import com.bill.blog.dto.CommentDto
import com.bill.blog.repository.CommentRepository
import com.bill.blog.service.CommentService
import org.springframework.stereotype.Service

/**
 * @author Bill.Lin on 2021/10/5
 */
@Service
class CommentServiceImpl(
        val commentRepository: CommentRepository
) : CommentService {
    override fun add(commentDto: CommentDto): Boolean {
        TODO("Not yet implemented")
    }

    override fun checkDone(ids: List<Long>): Boolean {
        TODO("Not yet implemented")
    }

    override fun delete(ids: List<Long>): Boolean {
        TODO("Not yet implemented")
    }

    override fun reply(id: Long, replyBody: String): Boolean {
        TODO("Not yet implemented")
    }

}