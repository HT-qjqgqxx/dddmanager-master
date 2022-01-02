package com.fastmanager.domain.service;

import com.fastmanager.application.service.SysUserService;
import com.fastmanager.domain.repository.SysUserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: SysUserDomain
 * @Description:
 * @Author:王红飞
 * @Date: 2022/1/2
 */
@Service
public class SysUserDomain implements SysUserService {

    @Resource
    SysUserRepository sysUserRepository;



}
