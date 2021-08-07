package com.bill.blog.repository

import com.bill.blog.entity.AdminUser
import com.bill.blog.entity.BlogCategory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.stereotype.Repository

/**
 * @author Bill.Lin on 2021/8/5
 */
@Repository
interface BlogCategoryRepository : JpaRepository<BlogCategory, Long>, QuerydslPredicateExecutor<BlogCategory> {
}