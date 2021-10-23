package com.bill.blog.service.impl

import com.bill.blog.repository.BlogTagRelationRepository
import com.bill.blog.service.BlogTagRelationService
import org.springframework.stereotype.Service

/**
 * @author Bill.Lin on 2021/10/5
 */
@Service
class BlogTagRelationServiceImpl(
        val blogTagRelationRepository: BlogTagRelationRepository
) : BlogTagRelationService {
}