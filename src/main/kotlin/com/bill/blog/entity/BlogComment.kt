package com.bill.blog.entity

import com.bill.blog.vo.SoftDeletedModel
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */

@Entity
@Table("blog_comment")
class BlogComment : SoftDeletedModel() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var commentId: Long? = null

    var blogId: Long = 0

    // 評論人
    var commentator: String = ""
        set(commentator) {
            field = commentator.trim { it <= ' ' }
        }

    var email: String = ""
        set(email) {
            field = email.trim { it <= ' ' }
        }

    var websiteUrl: String = ""
        set(websiteUrl) {
            field = websiteUrl.trim { it <= ' ' }
        }

    var commentContent: String = ""
        set(commentContent) {
            field = commentContent.trim { it <= ' ' }
        }

    var commentatorIp: String = ""
        set(commentatorIp) {
            field = commentatorIp.trim { it <= ' ' }
        }

    var replyContent: String = ""
        set(replyContent) {
            field = replyContent.trim { it <= ' ' }
        }

    var commentStatus: Byte = 0

}