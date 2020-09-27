package com.ltx.ltxweb_service.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ltx.commmon.BaseServiceImpl;
import com.ltx.commmon.IBaseDao;
import com.ltx.entity.SysUser;
import dao.UserDao;
import com.ltx.ltxweb_api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Program: dubbo_ltx
 * @ClassName: UserService
 * @Author: 李腾旭
 * @Date: 2020-07-13 17:12
 * @Description: ${todo}
 * @Version: V1.0
 */
@Component
@Service
public class UserService extends BaseServiceImpl<SysUser> implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public IBaseDao<SysUser> getBaseDao() {
        return userDao;
    }
}
