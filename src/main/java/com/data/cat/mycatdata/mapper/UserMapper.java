package com.data.cat.mycatdata.mapper;

import com.data.cat.mycatdata.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("insert into user(id,name) value (#{id},#{name})")
    int insert(User user);


    @Select("select * from user")
    List<User> selectAll();
}
