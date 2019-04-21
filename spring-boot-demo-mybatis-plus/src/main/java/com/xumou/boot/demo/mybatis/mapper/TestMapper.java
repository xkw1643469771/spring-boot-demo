package com.xumou.boot.demo.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xumou.boot.demo.mybatis.entty.TestEntity;
import org.apache.ibatis.annotations.Param;

public interface TestMapper extends BaseMapper<TestEntity>{

    IPage<TestEntity> select10(IPage<TestEntity> page, @Param("test") TestEntity testEntity);

}
