package com.bill.blog.entity

import com.bill.blog.vo.SoftDeletedModel
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */
@Entity
@Table("blog")
class Blog : SoftDeletedModel() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var blogId: Long = 0

    var blogCategoryId: Int = 0

    var blogTitle: String = ""
        set(blogTitle) {
            field = blogTitle.trim { it <= ' ' }
        }

    var blogSubUrl: String = ""
        set(blogSubUrl) {
            field = blogSubUrl.trim { it <= ' ' }
        }

    var blogCoverImage: String = ""
        set(blogCoverImage) {
            field = blogCoverImage.trim { it <= ' ' }
        }

    var blogCategoryName: String = ""
        set(blogCategoryName) {
            field = blogCategoryName.trim { it <= ' ' }
        }

    var blogTags: String = ""
        set(blogTags) {
            field = blogTags.trim { it <= ' ' }
        }

    var blogStatus: Byte = 0

    var blogViews: Long = 0

    var enableComment: Byte = 0

    var blogContent: String = ""
        set(blogContent) {
            field = blogContent.trim { it <= ' ' }
        }

}
