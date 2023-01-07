package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: wsd
 * @Create: 2023-01-02 16:45
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {//序列化再分布式会用到
    private Long id;
    private String serial;
}


