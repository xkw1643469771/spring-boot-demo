package com.xumou.boot.demo.mybatis.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xumou.boot.demo.mybatis.entty.TestEntity;
import com.xumou.boot.demo.mybatis.mapper.TestMapper;
import org.springframework.stereotype.Service;

@Service
public class TestService extends ServiceImpl<TestMapper, TestEntity> {

    // 通用查询分页
    public Object selectPage1() {
        IPage<TestEntity> page = new Page<>();
        page.setSize(15);
        Wrapper<TestEntity> warp = new QueryWrapper<>();
        return baseMapper.selectPage(page, warp);
    }

    // 自定义查询SQL分页
    public Object selectPage2() {
        IPage<TestEntity> page = new Page<>();
        page.setSize(10);
        TestEntity test = new TestEntity();
        return baseMapper.select10(page, test);
    }
}
