package com.bill.blog.service.impl

import com.bill.blog.repository.ConfigRepository
import com.bill.blog.service.ConfigService
import org.springframework.stereotype.Service

/**
 * @author Bill.Lin on 2021/10/5
 */
@Service
class ConfigServiceImpl(
        val configRepository: ConfigRepository
) : ConfigService {
}