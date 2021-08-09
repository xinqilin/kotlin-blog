package com.bill.blog.entity

import com.bill.blog.vo.SoftDeletedModel
import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */
@Entity
@Table(name = "blog_category")
data class BlogCategory(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var categoryId: Int = 0,
        var categoryName: String = "",
        var categoryIcon: String = "",
        var categoryRank: Int = 0,
        var isDeleted: Byte = 0,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        var createTime: Date = Date(),
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        var updateTime: Date = Date()
)