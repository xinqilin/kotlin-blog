package com.bill.blog.dto

import com.bill.blog.entity.AdminUser


/**
 * @author Bill.Lin on 2021/8/9
 */
data class AdminUserDto(
        var userName: String = "",
        var password: String = "",
        var nickName: String = "",
) {
    fun convertFromEntity(adminUser: AdminUser): AdminUserDto {
        return adminUser.run {
            AdminUserDto(userName, password, nickName)
        }
    }
}