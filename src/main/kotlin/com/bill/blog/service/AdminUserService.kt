package com.bill.blog.service

import com.bill.blog.dto.AdminUserDto

/**
 * @author Bill.Lin on 2021/8/5
 */
interface AdminUserService {

    fun register(adminUserDto: AdminUserDto): AdminUserDto

    fun login(userName: String, password: String): AdminUserDto?

    fun getUserDetailById(id: Int): AdminUserDto?

    fun updatePassword(id: Int, oldPassword: String, newPassword: String): Boolean

    fun updateUserName(id: Int, userName: String, nickName: String): Boolean
}