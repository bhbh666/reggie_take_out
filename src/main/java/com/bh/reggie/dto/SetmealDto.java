package com.bh.reggie.dto;

import com.bh.reggie.entity.Setmeal;
import com.bh.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
