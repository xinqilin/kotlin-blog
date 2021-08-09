package com.bill.blog.entity

import com.bill.blog.vo.SoftDeletedModel
import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */

@Entity
@Table(name = "admin_user")
data class AdminUser(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var adminUserId: Int? = null,
        var loginUserName: String = "",
        var loginPassword: String = "",
        var nickName: String = "",
        var isDeleted: Byte = 0,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        var createTime: Date = Date(),
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        var updateTime: Date = Date()
)