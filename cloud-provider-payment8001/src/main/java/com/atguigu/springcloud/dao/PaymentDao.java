package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: wsd
 * @Create: 2023-01-02 0:17
 * @Description:
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);//写操作

    public Payment getPaymentById(@Param("id") Long id);//读操作
}
