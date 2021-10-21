package com.bill.blog.entity

import com.bill.blog.vo.SoftDeletedModel
import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */

@Entity
@Table(name = "blog_comment")
@EntityListeners(AuditingEntityListener::class)
data class Comment(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var commentId: Long? = null,

        @Column(name = "blog_id", columnDefinition = "integer NOT NULL DEFAULT 0")
        var blogId: Long = 0,

        // 評論人
        @Column(name = "comment_ator", columnDefinition = "varchar(200) NOT NULL DEFAULT ''")
        var commentator: String = "",

        @Column(name = "email", columnDefinition = "varchar(200) NOT NULL DEFAULT ''")
        var email: String = "",

        @Column(name = "website_url", columnDefinition = "varchar(200) NOT NULL DEFAULT ''")
        var websiteUrl: String = "",

        @Column(name = "comment_content", columnDefinition = "varchar(500) NOT NULL DEFAULT ''")
        var commentContent: String = "",

        @Column(name = "comment_ator_ip", columnDefinition = "varchar(20) NOT NULL DEFAULT ''")
        var commentatorIp: String = "",

        @Column(name = "reply_content", columnDefinition = "varchar(200) NOT NULL DEFAULT ''")
        var replyContent: String = "",

        @Column(name = "comment_status", columnDefinition = "TINYINT(1) DEFAULT 0", nullable = false)
        var commentStatus: Byte = 0,

        @Column(name = "deleted", columnDefinition = "TINYINT(1) DEFAULT 0", nullable = false)
        var isDeleted: Byte = 0,

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        @CreatedDate
        @Column(name = "create_time", columnDefinition = "DATETIME", updatable = false)
        var createTime: Date = Date(),

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        @LastModifiedDate
        @Column(name = "update_time", columnDefinition = "DATETIME")
        var updateTime: Date = Date()
)