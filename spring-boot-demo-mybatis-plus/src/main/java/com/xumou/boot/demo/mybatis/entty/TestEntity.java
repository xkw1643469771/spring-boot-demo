package com.xumou.boot.demo.mybatis.entty;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tbl_test")
public class TestEntity {

    // IdType.ID_WORKER 使用 IdWorker.getId() 自动生成分布式id
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    private String name;
    private Date birthday;
    private String username;
    private String password;

}
