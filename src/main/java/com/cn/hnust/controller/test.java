package com.cn.hnust.controller;

import com.alibaba.fastjson.JSON;
import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class test {
    private static Logger logger = Logger.getLogger(TestMyBatis.class.getName());

    @Autowired
    private IUserDao iUserDao;

    @Resource
    private IUserService userService = null;

    @Test
    public void test1() {
        User user = userService.getUserById(5);
        logger.info(JSON.toJSONString(user));
    }

    @Test
    public void test2() {
        List<User> user = userService.GetUserAll();
        logger.info(JSON.toJSONString(user));
    }

    @Test
    public void test3() {
        PageHelper.startPage(1, 5);
        List<User> userList = userService.GetUserAll();
        System.out.println("--------------" + userList + "----------------");
        PageInfo<User> pageInfo = new PageInfo<>(userList, 5);
        logger.info(pageInfo.getList().toString());
    }
}
