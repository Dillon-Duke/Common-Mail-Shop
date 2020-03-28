package com.tencent.service.impl;

import com.tencent.entity.LoginHist;
import com.tencent.mapper.LoginHistMapper;
import com.tencent.service.LoginHistService;
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
public class LoginHistServiceImpl extends ServiceImpl<LoginHistMapper, LoginHist> implements LoginHistService {

}
