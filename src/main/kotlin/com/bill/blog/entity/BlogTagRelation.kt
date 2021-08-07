package com.bill.blog.entity

import com.bill.blog.vo.SoftDeletedModel
import javax.persistence.*

/**
 * @author Bill.Lin on 2021/8/4
 */
@Entity
@Table("blog_tag_relation")
class BlogTagRelation : SoftDeletedModel(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var relationId: Long? = null

    var blogId: Long = 0

    var tagId: Int = 0

}