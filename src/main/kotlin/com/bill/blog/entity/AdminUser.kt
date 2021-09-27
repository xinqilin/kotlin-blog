package com.bill.blog.entity

import com.bill.blog.dto.AdminUserDto
import com.fasterxml.jackson.annotation.JsonFormat
import org.hibernate.annotations.Where
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */

@Entity
@Table(name = "admin_user")
@Where(clause = "deleted = false")
@EntityListeners(AuditingEntityListener::class)
data class AdminUser(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var id: Int? = null,

        @Column(name = "user_name", columnDefinition = "varchar(30) NOT NULL DEFAULT ''")
        var userName: String = "",

        @Column(name = "password", columnDefinition = "varchar(30) NOT NULL DEFAULT ''")
        var password: String = "",

        @Column(name = "nick_name", columnDefinition = "varchar(50) NOT NULL DEFAULT ''")
        var nickName: String = "",

        @Column(name = "deleted", columnDefinition = "TINYINT(1) DEFAULT 0", nullable = false)
        var deleted: Byte = 0,

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        @CreatedDate
        @Column(name = "create_time", columnDefinition = "DATETIME", updatable = false)
        var createTime: Date = Date(),

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        @LastModifiedDate
        @Column(name = "update_time", columnDefinition = "DATETIME")
        var updateTime: Date = Date()
) {
    fun toDto() = AdminUserDto(
            id = id!!,
            userName = userName,
            password = password,
            nickName = nickName
    )
}