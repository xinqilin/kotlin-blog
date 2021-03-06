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
@Table(name = "blog_config")
@EntityListeners(AuditingEntityListener::class)
data class Config(

        @Id
        @Column(name = "config_key")
        var configKey: String = "",

        @Column(name = "config_value", columnDefinition = "TEXT NOT NULL")
        var configValue: String = "",

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