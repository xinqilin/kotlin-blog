package com.bill.blog.controller

import com.bill.blog.dto.AdminUserDto
import com.bill.blog.service.AdminUserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Bill.Lin on 2021/8/9
 */

@RequestMapping("/admin")
@RestController
class AdminUserController(
        val adminUserService: AdminUserService
) {

    @PostMapping("/user")
    fun addAdminUser(@RequestBody adminUserDto: AdminUserDto) = adminUserService.register(adminUserDto)

    @PostMapping("/login")
    fun login(@RequestBody adminUserDto: AdminUserDto) = adminUserService.login(adminUserDto.userName, adminUserDto.password)
}