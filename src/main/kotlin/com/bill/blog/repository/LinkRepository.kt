package com.bill.blog.repository


import com.bill.blog.entity.Link
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

/**
 * @author Bill.Lin on 2021/8/5
 */
@Repository
interface LinkRepository : JpaRepository<Link, Long>, JpaSpecificationExecutor<Link> {
}