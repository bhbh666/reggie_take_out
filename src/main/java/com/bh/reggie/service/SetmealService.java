package com.bh.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bh.reggie.dto.SetmealDto;
import com.bh.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    void saveWithDish(SetmealDto setmealDto);
    void deleteWithDish(List<Long> ids);
    SetmealDto getByIdWithDish(Long id);
    void updateWithDish(SetmealDto setmealDto);
}
