package com.bh.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bh.reggie.entity.Orders;

public interface OrderService extends IService<Orders> {
    void submit(Orders orders);
}
