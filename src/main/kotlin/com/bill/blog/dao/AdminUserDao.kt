package com.bill.blog.dao

import com.bill.blog.repository.AdminUserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * @author Bill.Lin on 2021/8/5
 */
@Component
class AdminUserDao {

    @Autowired
    lateinit var adminUserRepository: AdminUserRepository

}