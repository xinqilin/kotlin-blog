package com.bill.blog.entity

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */
@Entity
@Table("blog_category")
class BlogCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var categoryId: Int = 0

    var categoryName: String = ""
        set(categoryName) {
            field = categoryName.trim { it <= ' ' }
        }

    var categoryIcon: String = ""
        set(categoryIcon) {
            field = categoryIcon.trim { it <= ' ' }
        }

    var categoryRank: Int = 0

    var isDeleted: Byte = 0

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    var createTime: Date = Date()

}