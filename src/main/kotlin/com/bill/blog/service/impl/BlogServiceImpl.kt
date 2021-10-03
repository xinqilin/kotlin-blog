package com.bill.blog.service.impl

import com.bill.blog.dto.BlogDetailDto
import com.bill.blog.dto.BlogDto
import com.bill.blog.repository.BlogRepository
import com.bill.blog.service.BlogService

/**
 * @author Bill.Lin on 2021/9/30
 */
class BlogServiceImpl(
        val blogRepository: BlogRepository
) : BlogService {
    override fun save(blogDto: BlogDto): BlogDto {
        TODO("Not yet implemented")
    }

    override fun deleteBatch(ids: List<Long>): Boolean {
        TODO("Not yet implemented")
    }

    override fun getTotals(): Int {
        TODO("Not yet implemented")
    }

    override fun getById(id: Long): BlogDto {
        TODO("Not yet implemented")
    }

    override fun update(blogDto: BlogDto): BlogDto {
        TODO("Not yet implemented")
    }

    override fun getListIndexPage(type: Int): List<BlogDto> {
        TODO("Not yet implemented")
    }

    override fun getDetail(id: Long): BlogDetailDto? {
        TODO("Not yet implemented")
    }

    override fun getDetailBySubUrl(subUrl: String): BlogDetailDto? {
        TODO("Not yet implemented")
    }

}