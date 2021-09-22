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
@Table(name = "blog")
@EntityListeners(AuditingEntityListener::class)
data class Blog(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var id: Long = 0,

        @Column(name = "category_id", columnDefinition = "integer NOT NULL DEFAULT 0")
        var categoryId: Int = 0,

        @Column(name = "title", columnDefinition = "varchar(100) NOT NULL DEFAULT ''")
        var title: String = "",

        @Column(name = "sub_url", columnDefinition = "varchar(200) NOT NULL DEFAULT ''")
        var subUrl: String = "",

        @Column(name = "cover_image", columnDefinition = "varchar(200) NOT NULL DEFAULT ''")
        var coverImage: String = "",

        @Column(name = "category_name", columnDefinition = "varchar(200) NOT NULL DEFAULT ''")
        var categoryName: String = "",

        @Column(name = "tags", columnDefinition = "varchar(200) NOT NULL DEFAULT ''")
        var tags: String = "",

        @Column(name = "status", columnDefinition = "TINYINT(1) DEFAULT 0", nullable = false)
        var status: Byte = 0,

        @Column(name = "views", columnDefinition = "integer NOT NULL DEFAULT 0")
        var views: Long = 0,

        @Column(name = "enable_comment", columnDefinition = "TINYINT(1) DEFAULT 0", nullable = false)
        var enableComment: Byte = 0,

        @Column(name = "content", columnDefinition = "TEXT NOT NULL")
        var content: String = "",

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
