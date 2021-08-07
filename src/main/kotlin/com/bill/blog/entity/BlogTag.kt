package com.bill.blog.entity

import com.bill.blog.vo.SoftDeletedModel
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */
@Entity
@Table("blog_tag")
class BlogTag : SoftDeletedModel() {

    @Id
    @GeneratedValue(GenerationType.IDENTITY)
    var tagId: Int = 0

    var tagName: String = ""
        set(tagName) {
            field = tagName.trim { it <= ' ' }
        }


}