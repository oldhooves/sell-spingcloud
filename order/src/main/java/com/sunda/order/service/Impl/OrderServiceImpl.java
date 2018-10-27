package com.sunda.order.service.Impl;

import com.sunda.order.dataobject.OrderMaster;
import com.sunda.order.dto.OrderDTO;
import com.sunda.order.enums.OrderStatusEnum;
import com.sunda.order.enums.PayStatusEnum;
import com.sunda.order.repository.OrderDetailRepository;
import com.sunda.order.repository.OrderMasterRepository;
import com.sunda.order.service.OrderService;
import com.sunda.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by 老蹄子 on 2018/10/27 下午8:57
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderMasterRepository orderMasterRepository;


    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        // TODO 查询商品信息(调用商品服务)
        // TODO 计算总价
        // TODO 扣库存(调用商品服务)

        //订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(KeyUtil.genUniqueKey());
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(10));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}
