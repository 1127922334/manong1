package com.manong.mapper;

import com.manong.pojo.UserS;
import com.manong.pojo.UserSExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserSMapper {
    int countByExample(UserSExample example);

    int deleteByExample(UserSExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserS record);

    int insertSelective(UserS record);

    List<UserS> selectByExample(UserSExample example);

    UserS selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserS record, @Param("example") UserSExample example);

    int updateByExample(@Param("record") UserS record, @Param("example") UserSExample example);

    int updateByPrimaryKeySelective(UserS record);

    int updateByPrimaryKey(UserS record);
}