package com.tencent.service.impl;

import com.tencent.entity.Category;
import com.tencent.mapper.CategoryMapper;
import com.tencent.service.CategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
