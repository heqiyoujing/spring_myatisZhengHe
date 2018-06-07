package com.cn.hnust.controller;


import com.alibaba.fastjson.JSON;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger log = Logger.getLogger(TestMyBatis.class);
    private static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TestMyBatis.class.getName());

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
        log.info(JSON.toJSONString(user));
    }
}
