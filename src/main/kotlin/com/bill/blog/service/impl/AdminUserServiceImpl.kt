package com.bill.blog.service.impl

import com.bill.blog.dto.AdminUserDto
import com.bill.blog.entity.AdminUser
import com.bill.blog.repository.AdminUserRepository
import com.bill.blog.service.AdminUserService
import org.springframework.stereotype.Service
import java.lang.RuntimeException

/**
 * @author Bill.Lin on 2021/8/9
 */
@Service
class AdminUserServiceImpl(
        val adminUserRepository: AdminUserRepository
) : AdminUserService {

    override fun register(adminUserDto: AdminUserDto) =
            AdminUser(
                    null,
                    adminUserDto.userName.trim(),
                    adminUserDto.password.trim(),
                    adminUserDto.nickName.trim()
            ).run {
                adminUserRepository.save(this).toDto()
            }

    override fun login(userName: String, password: String): AdminUserDto =
            adminUserRepository.findByUserNameAndPassword(userName, password)
                    .map { it.toDto() }
                    .orElseThrow { RuntimeException() }

    override fun getUserDetailById(id: Int): AdminUserDto =
            adminUserRepository.findById(id)
                    .map { it.toDto() }
                    .orElseThrow { RuntimeException() }

    override fun updatePassword(id: Int, oldPassword: String, newPassword: String) =
            adminUserRepository.findById(id)
                    .orElseThrow { RuntimeException() }
                    .let {
                        if (it.password != oldPassword) throw RuntimeException()
                        it
                    }.run {
                        this.password = newPassword
                        adminUserRepository.save(this)
                        true
                    }

    override fun updateUserName(id: Int, userName: String, nickName: String) =
            adminUserRepository.findById(id)
                    .orElseThrow { RuntimeException() }
                    .run {
                        this.userName = userName
                        this.nickName = nickName
                        adminUserRepository.save(this)
                        true
                    }
}