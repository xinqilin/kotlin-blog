package com.bill.blog.repository

import com.bill.blog.entity.AdminUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

/**
 * @author Bill.Lin on 2021/8/5
 */
@Repository
interface AdminUserRepository : JpaRepository<AdminUser, Long>, JpaSpecificationExecutor<AdminUser> {

    @Query
    fun findByUserNameAndPassword(userName: String, password: String): Optional<AdminUser>
}