package com.bill.blog.controller

import com.bill.blog.dto.AdminUserDto
import com.bill.blog.service.AdminUserService
import com.bill.blog.service.BlogService
import org.springframework.web.bind.annotation.*

/**
 * @author Bill.Lin on 2021/8/9
 */

@RequestMapping("/blog")
@RestController
class BlogController(
        val blogService: BlogService
) {

    @PostMapping("/list")
    fun listBlogs(): Unit {

    }

    @PostMapping("")
    fun listOne(): Unit {

    }

    @PostMapping("")
    fun save(): Result<Any> {

    }

    @PutMapping("")
    fun update(): Result<Any> {

    }

    @DeleteMapping("")
    fun delete(): Result<Any> {

    }
}