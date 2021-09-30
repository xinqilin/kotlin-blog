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

@RequestMapping("/blog")
@RestController
class BlogController(
        val adminUserService: AdminUserService
) {

    @PostMapping("/list")
    fun listBlogs(): Unit {

    }

    @PostMapping("")
    fun listOne(): Unit {

    }
}