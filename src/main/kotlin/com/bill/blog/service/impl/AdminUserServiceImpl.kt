package com.bill.blog.service.impl

import com.bill.blog.dto.AdminUserDto
import com.bill.blog.entity.AdminUser
import com.bill.blog.repository.AdminUserRepository
import com.bill.blog.service.AdminUserService
import org.springframework.stereotype.Service

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
                val saveAdminUser = adminUserRepository.save(this)
                AdminUserDto(saveAdminUser.userName, saveAdminUser.password, saveAdminUser.nickName)
            }

    override fun login(userName: String, password: String): AdminUserDto? {
        TODO("Not yet implemented")
    }

    override fun getUserDetailById(id: Int): AdminUserDto? {
        TODO("Not yet implemented")
    }

    override fun updatePassword(id: Int, oldPassword: String, newPassword: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun updateUserName(id: Int, userName: String, nickName: String): Boolean {
        TODO("Not yet implemented")
    }
}