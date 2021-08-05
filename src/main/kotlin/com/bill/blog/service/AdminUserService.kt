package com.bill.blog.service

import com.bill.blog.entity.AdminUser

/**
 * @author Bill.Lin on 2021/8/5
 */
interface AdminUserService {

    fun login(userName: String, password: String): AdminUser?

    fun getUserDetailById(loginUserId: Int): AdminUser?

    fun updatePassword(loginUserId: Int, oldPassword: String, newPassword: String): Boolean

    fun updateUserName(loginUserId: Int, loginUserName: String, nickName: String): Boolean
}