package com.secret.dao;

import com.secret.pojo.po.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
//TODO  添加@Mapper注解
@Mapper
public interface UserDao {
    @Select("select * from test02.account where name = #{name}")
    public User getUserByName(String name);

    @Select("select money from test02.account where name = #{name}")
    public int getMoneyByName(String name);

    @Select("select * from test02.account")
    public List<User> getAll();

    @Delete("delete from test02.account where name = #{name}")
    public int deleteUserByName(String name);

    @Insert("insert into test02.account (name, money) values (#{name}, #{money})")
    public int addUser(User user);

    @Update("update test02.account set money = #{user.money} where name = #{user.name}")
    public int updateUser(User user);

    @Select("select * from test02.account where ID = #{ID}")
    public User getUserByID(int ID);

    @Delete("delete from test02.account where ID = #{ID}")
    public int deleteUserByID(int ID);

    @Update("update test02.account set money = #{money} where ID = #{ID}")
    public int updateUserMoneyByID(int money, int ID);


}
