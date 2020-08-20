package com.kmu.manager.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kmu.manager.entity.Role;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Deng
 * @since 2020-07-25
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<String> selectRoleNameByManagerId(Integer id);

}
