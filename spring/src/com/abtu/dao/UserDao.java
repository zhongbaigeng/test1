package com.abtu.dao;


import com.abtu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
/**
 * @author 12522
 */
@Repository("UserDao")
@Mapper



public interface UserDao {


@Select("select * from user where username=#{arg0} and password=#{arg1}")
User findByUsernameANDpwd(String username, String password);

}
