package com.bill.blog.entity

import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */

@Entity
@Table("admin_user")
class AdminUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var adminUserId: Int? = null

    var loginUserName: String = ""
        set(loginUserName) {
            field = loginUserName?.trim { it <= ' ' }
        }

    var loginPassword: String = ""
        set(loginPassword) {
            field = loginPassword?.trim { it <= ' ' }
        }

    var nickName: String = ""
        set(nickName) {
            field = nickName?.trim { it <= ' ' }
        }

    var locked: Byte = 0
}