package com.ltx.commmon;

import java.util.List;

/**
 * @Program: dubbo_ltx
 * @ClassName: BaseServiceImpl
 * @Author: 李腾旭
 * @Date: 2020-07-13 15:45
 * @Description: ${todo}
 * @Version: V1.0
 */
public  abstract class BaseServiceImpl<T> implements IBaseService<T> {

    public abstract IBaseDao<T> getBaseDao();

    public List<T> selectBycount(String count) {
        return getBaseDao().selectByAccount(count);
    }
}
