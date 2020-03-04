package com.cy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cy.pojo.TStudent;
import org.apache.ibatis.annotations.Param;

public interface ProDao extends BaseMapper<TStudent> {

    TStudent getUser(@Param("id") Integer id);
}
