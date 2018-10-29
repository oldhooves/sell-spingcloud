package com.sunda.order.repository;

import com.sunda.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 老蹄子 on 2018/10/26 下午9:33
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
