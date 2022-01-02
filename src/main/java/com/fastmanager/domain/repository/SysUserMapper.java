package com.fastmanager.domain.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fastmanager.domain.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: SysUserMapper
 * @Description:
 * @Author:王红飞
 * @Date: 2022/1/2
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}
