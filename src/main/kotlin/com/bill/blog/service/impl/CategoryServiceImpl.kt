package com.bill.blog.service.impl

import com.bill.blog.dto.CategoryDto
import com.bill.blog.repository.CategoryRepository
import com.bill.blog.service.CategoryService
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service

/**
 * @author Bill.Lin on 2021/10/21
 */
@Service
class CategoryServiceImpl(
        val categoryRepository: CategoryRepository
) : CategoryService {
    override fun getBlogCategoryPage(pageUtil: Page<CategoryDto>): CategoryDto {
        TODO("Not yet implemented")
    }

    override fun getTotalCount(): Int {
        TODO("Not yet implemented")
    }

    override fun save(categoryDto: CategoryDto): Boolean {
        TODO("Not yet implemented")
    }

    override fun update(categoryDto: CategoryDto): Boolean {
        TODO("Not yet implemented")
    }

    override fun delete(id: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<CategoryDto> {
        TODO("Not yet implemented")
    }

}