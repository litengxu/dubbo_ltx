package com.ltx.commmon;

import java.util.List;

/**
 * @Program: dubbo_ltx
 * @ClassName: IBaseService
 * @Author: 李腾旭
 * @Date: 2020-07-13 15:43
 * @Description: ${todo}
 * @Version: V1.0
 */
public interface IBaseService<T> {
    List<T> selectBycount(String count);
}
