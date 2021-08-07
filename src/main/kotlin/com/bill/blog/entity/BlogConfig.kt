package com.bill.blog.entity

import com.bill.blog.vo.SoftDeletedModel
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * @author Bill.Lin on 2021/8/4
 */
@Entity
@Table("blog_config")
class BlogConfig : SoftDeletedModel() {

    @Id
    var configKey: String = ""
        set(configKey) {
            field = configKey.trim { it <= ' ' }
        }

    var configValue: String = ""
        set(configValue) {
            field = configValue.trim { it <= ' ' }
        }

}