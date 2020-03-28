package com.tencent.service.impl;

import com.tencent.entity.User;
import com.tencent.mapper.UserMapper;
import com.tencent.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
