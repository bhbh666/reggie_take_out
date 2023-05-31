package com.bh.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bh.reggie.dto.DishDto;
import com.bh.reggie.entity.Dish;

public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);
    public DishDto getByIdWithFlavor(Long id);
    public void updateWithFlavor(DishDto dishDto);
    public void remove(Long id);
}
