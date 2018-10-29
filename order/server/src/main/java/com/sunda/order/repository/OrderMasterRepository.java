package com.sunda.order.repository;

import com.sunda.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 老蹄子 on 2018/10/26 下午9:34
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
}
