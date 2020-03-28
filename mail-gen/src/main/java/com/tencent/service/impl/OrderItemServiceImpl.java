package com.tencent.service.impl;

import com.tencent.entity.OrderItem;
import com.tencent.mapper.OrderItemMapper;
import com.tencent.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jinpeng
 * @since 2020-03-25
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
