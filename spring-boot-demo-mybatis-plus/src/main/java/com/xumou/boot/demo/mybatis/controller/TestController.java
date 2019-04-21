package com.xumou.boot.demo.mybatis.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.xumou.boot.demo.mybatis.entty.TestEntity;
import com.xumou.boot.demo.mybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    //新增
    @GetMapping("test1")
    public Object test1(){
        TestEntity test = new TestEntity();
        testService.save(test);
        return testService.list();
    }

    //修改，只改有值的字段
    @GetMapping("test2")
    public Object test2(){
        TestEntity test = new TestEntity();
        test.setId(1119866828630331394L);
        test.setName("tom");
        test.setBirthday(new Date());
        testService.saveOrUpdate(test);
        return testService.list();
    }

    //修改，通过warp条件
    @GetMapping("test3")
    public Object test3(){
        UpdateWrapper<TestEntity> wrap = new UpdateWrapper<>();
        wrap.eq("id", 1119866828630331394L);
        wrap.set("name", "123123123");
        testService.update(wrap);
        return testService.list();
    }

    //查询： 通过查询分页
    @GetMapping("test4")
    public Object test4(){
        return testService.selectPage1();
    }

    //查询： 自定义SQL分页
    @GetMapping("test5")
    public Object test5(){
        return testService.selectPage2();
    }

}
