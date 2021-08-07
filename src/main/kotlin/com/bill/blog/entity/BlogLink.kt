package com.bill.blog.entity

import com.bill.blog.vo.SoftDeletedModel
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */
@Entity
@Table("blog_link")
class BlogLink : SoftDeletedModel() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var linkId: Int? = null

    var linkType: Byte = 0

    var linkName: String = ""
        set(linkName) {
            field = linkName.trim { it <= ' ' }
        }

    var linkUrl: String = ""
        set(linkUrl) {
            field = linkUrl.trim { it <= ' ' }
        }

    var linkDescription: String = ""
        set(linkDescription) {
            field = linkDescription.trim { it <= ' ' }
        }

    var linkRank: Int = 0

}