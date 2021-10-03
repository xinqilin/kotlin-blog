package com.bill.blog.service

import com.bill.blog.dto.BlogDetailDto
import com.bill.blog.dto.BlogDto
import org.springframework.data.domain.Page
import org.springframework.data.jpa.domain.Specification

/**
 * @author Bill.Lin on 2021/9/30
 */
interface BlogService {

    fun save(blogDto: BlogDto): BlogDto

    //TODO: kotlin pageable
    fun getPage(pageUtil: Page<BlogDto>): Specification<BlogDto>

    fun deleteBatch(ids: List<Long>): Boolean

    fun getTotals(): Int

    fun getById(id: Long): BlogDto

    fun update(blogDto: BlogDto): BlogDto

    fun getIndexPage(page: Int): Specification<BlogDto>

    fun getListIndexPage(type: Int): List<BlogDto>

    fun getDetail(id: Long): BlogDetailDto?

    fun getPageByTag(tagName: String, page: Int): Specification<BlogDto>

    fun getPageByCategory(categoryId: String, page: Int): Specification<BlogDto>

    fun getPageBySearch(keyword: String, page: Int): Specification<BlogDto>

    fun getDetailBySubUrl(subUrl: String): BlogDetailDto?
}