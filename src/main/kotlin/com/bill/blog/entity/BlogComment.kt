package com.bill.blog.entity

import com.bill.blog.vo.SoftDeletedModel
import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */

@Entity
@Table(name = "blog_comment")
data class BlogComment(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var commentId: Long? = null,
        var blogId: Long = 0,
        // 評論人
        var commentator: String = "",
        var email: String = "",
        var websiteUrl: String = "",
        var commentContent: String = "",
        var commentatorIp: String = "",
        var replyContent: String = "",
        var commentStatus: Byte = 0,
        var isDeleted: Byte = 0,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        var createTime: Date = Date(),
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        var updateTime: Date = Date()
)