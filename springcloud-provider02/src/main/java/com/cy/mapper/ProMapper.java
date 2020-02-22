package com.cy.mapper;

import com.cy.pojo.TStudent;
import org.apache.ibatis.annotations.Select;

public interface ProMapper {

    @Select("select * from t_student where id = #{id}")
    TStudent getStu(Integer id);
}
