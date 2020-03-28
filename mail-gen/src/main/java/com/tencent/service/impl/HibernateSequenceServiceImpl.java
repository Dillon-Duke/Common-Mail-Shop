package com.tencent.service.impl;

import com.tencent.entity.HibernateSequence;
import com.tencent.mapper.HibernateSequenceMapper;
import com.tencent.service.HibernateSequenceService;
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
public class HibernateSequenceServiceImpl extends ServiceImpl<HibernateSequenceMapper, HibernateSequence> implements HibernateSequenceService {

}
