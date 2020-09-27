package com.ltx.commmon;
import java.util.List;
/**
 * @Program: dubbo_ltx
 * @ClassName: IBaseDao
 * @Author: 李腾旭
 * @Date: 2020-07-13 15:38
 * @Description: ${todo}
 * @Version: V1.0
 */
public interface IBaseDao<T> {
    List<T> selectByAccount(String count);

}
