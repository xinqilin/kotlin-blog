package com.bill.blog.entity

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
@Table(name = "blog_category")
@EntityListeners(AuditingEntityListener::class)
data class BlogCategory(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var categoryId: Int = 0,

        @Column(name = "category_name", columnDefinition = "varchar(100) NOT NULL DEFAULT ''")
        var categoryName: String = "",

        @Column(name = "category_icon", columnDefinition = "varchar(500) NOT NULL DEFAULT ''")
        var categoryIcon: String = "",

        @Column(name = "category_rank", columnDefinition = "integer NOT NULL DEFAULT 0")
        var categoryRank: Int = 0,

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