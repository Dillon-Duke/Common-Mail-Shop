package com.tencent.service.impl;

import com.tencent.entity.Person;
import com.tencent.mapper.PersonMapper;
import com.tencent.service.PersonService;
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
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {

}
