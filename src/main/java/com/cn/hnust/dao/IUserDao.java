package com.cn.hnust.dao;

import com.cn.hnust.pojo.User;

import java.util.List;

public interface IUserDao {
    User selectByPrimaryKey(int userId);

    List<User> selectAll();
}
