package com.bill.blog.service.impl

import com.bill.blog.dto.LinkDto
import com.bill.blog.repository.LinkRepository
import com.bill.blog.service.LinkService
import org.springframework.stereotype.Service

/**
 * @author Bill.Lin on 2021/10/5
 */
@Service
class LinkServiceImpl(
        val linkRepository: LinkRepository
) : LinkService {
    override fun getAll(): List<LinkDto> {
        TODO("Not yet implemented")
    }

    override fun get(id: Int?): LinkDto {
        TODO("Not yet implemented")
    }

    override fun add(linkDto: LinkDto): Boolean {
        TODO("Not yet implemented")
    }

    override fun update(linkDto: LinkDto): Boolean {
        TODO("Not yet implemented")
    }

    override fun delete(ids: List<Long>): Boolean {
        TODO("Not yet implemented")
    }
}