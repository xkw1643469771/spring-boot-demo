package com.xumou.boot.demo.mybatis.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xumou.boot.demo.mybatis.entty.TestEntity;
import com.xumou.boot.demo.mybatis.mapper.TestMapper;
import org.springframework.stereotype.Service;

@Service
public class TestService extends ServiceImpl<TestMapper, TestEntity> {
}
