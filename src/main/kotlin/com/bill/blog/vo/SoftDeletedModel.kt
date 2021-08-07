package com.bill.blog.vo

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*

/**
 * @author Bill.Lin on 2021/8/7
 */
open class SoftDeletedModel {

    var isDeleted: Byte = 0

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    var createTime: Date = Date()

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    var updateTime: Date = Date()
}