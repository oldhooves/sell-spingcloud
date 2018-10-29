package com.sunda.order.service;

import com.sunda.order.dto.OrderDTO;

/**
 * Created by 老蹄子 on 2018/10/26 下午9:35
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
