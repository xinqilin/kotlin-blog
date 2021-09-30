package com.bill.blog.service.impl

import com.bill.blog.repository.BlogRepository
import com.bill.blog.service.BlogService

/**
 * @author Bill.Lin on 2021/9/30
 */
class BlogServiceImpl(
        val blogRepository: BlogRepository
) : BlogService {

}