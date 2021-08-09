package com.bill.blog.entity

import com.bill.blog.vo.SoftDeletedModel
import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */
//@Entity
//@Table(name = "blog")
data class Blog(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var blogId: Long = 0,
        var blogCategoryId: Int = 0,
        var blogTitle: String = "",
        var blogSubUrl: String = "",
        var blogCoverImage: String = "",
        var blogCategoryName: String = "",
        var blogTags: String = "",
        var blogStatus: Byte = 0,
        var blogViews: Long = 0,
        var enableComment: Byte = 0,
        var blogContent: String = "",
        var isDeleted: Byte = 0,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        var createTime: Date = Date(),
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        var updateTime: Date = Date()

)
