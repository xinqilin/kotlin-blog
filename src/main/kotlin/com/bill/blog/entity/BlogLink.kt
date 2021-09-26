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
@Table(name = "blog_link")
@EntityListeners(AuditingEntityListener::class)
data class BlogLink(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var linkId: Int? = null,

        @Column(name = "link_type", columnDefinition = "TINYINT(1) DEFAULT 0", nullable = false)
        var linkType: Byte = 0,

        @Column(name = "link_name", columnDefinition = "varchar(200) NOT NULL DEFAULT ''")
        var linkName: String = "",

        @Column(name = "link_url", columnDefinition = "varchar(500) NOT NULL DEFAULT ''")
        var linkUrl: String = "",

        @Column(name = "link_description", columnDefinition = "varchar(1000) NOT NULL DEFAULT ''")
        var linkDescription: String = "",

        @Column(name = "link_rank", columnDefinition = "integer NOT NULL DEFAULT 0")
        var linkRank: Int = 0,

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