package com.bill.blog.repository


import com.bill.blog.entity.BlogTag
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

/**
 * @author Bill.Lin on 2021/8/5
 */
@Repository
interface BlogTagRepository : JpaRepository<BlogTag, Long>, JpaSpecificationExecutor<BlogTag> {
}