package com.bill.blog.service

import com.bill.blog.dto.CategoryDto
import org.springframework.data.domain.Page
import java.util.*

/**
 * @author Bill.Lin on 2021/10/5
 */
interface CategoryService {

    fun getBlogCategoryPage(pageUtil: Page<CategoryDto>): CategoryDto

    fun getTotalCount(): Int

    fun save(categoryDto: CategoryDto): Boolean

    fun update(categoryDto: CategoryDto): Boolean

    fun delete(id: Int): Boolean

    fun getAll(): List<CategoryDto>
}