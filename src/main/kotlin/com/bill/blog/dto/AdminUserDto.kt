package com.bill.blog.dto

import com.bill.blog.entity.AdminUser


/**
 * @author Bill.Lin on 2021/8/9
 */
data class AdminUserDto(
        var id: Int,
        var userName: String = "",
        var password: String = "",
        var nickName: String = "",
) {
    fun toEntity() = AdminUser(
//TODO:
    )
}