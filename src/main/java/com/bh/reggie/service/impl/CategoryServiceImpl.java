package com.bh.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bh.reggie.common.CustomException;
import com.bh.reggie.entity.Category;
import com.bh.reggie.entity.Dish;
import com.bh.reggie.entity.Setmeal;
import com.bh.reggie.mapper.CategoryMapper;
import com.bh.reggie.service.CategoryService;
import com.bh.reggie.service.DishService;
import com.bh.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private DishService dishService;
    @Autowired
    private SetmealService setmealService;
    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> wrapper1 = new LambdaQueryWrapper<>();
        wrapper1.eq(Dish::getCategoryId,id);
        long count1 = dishService.count(wrapper1);
        if (count1>0){
            throw new CustomException("此分类关联了菜品");
        }
        LambdaQueryWrapper<Setmeal> wrapper2 = new LambdaQueryWrapper<>();
        wrapper2.eq(Setmeal::getCategoryId,id);
        long count2 = setmealService.count(wrapper2);
        if (count2>0){
            throw new CustomException("此分类关联了套餐");
        }
        super.removeById(id);
    }
}
