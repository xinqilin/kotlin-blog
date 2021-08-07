package com.bill.blog.entity

import com.bill.blog.vo.SoftDeletedModel
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */
@Entity
@Table("blog_category")
class BlogCategory : SoftDeletedModel() {

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


}