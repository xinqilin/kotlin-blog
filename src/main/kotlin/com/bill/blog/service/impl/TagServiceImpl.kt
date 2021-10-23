package com.bill.blog.service.impl

import com.bill.blog.dto.TagDto
import com.bill.blog.repository.TagRepository
import com.bill.blog.service.TagService
import org.springframework.stereotype.Service

/**
 * @author Bill.Lin on 2021/10/5
 */
@Service
class TagServiceImpl(
        val tagRepository: TagRepository
) : TagService {
    override fun getTotals(): Int {
        TODO("Not yet implemented")
    }

    override fun add(tagDto: TagDto): Boolean {
        TODO("Not yet implemented")
    }

    override fun delete(ids: List<Int>): Boolean {
        TODO("Not yet implemented")
    }
}