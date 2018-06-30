package com.dairuijie.mgr.dao;

import com.dairuijie.mgr.pojo.Users;
import com.dairuijie.mgr.pojo.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExampleWithRowbounds(UsersExample example, RowBounds rowBounds);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}