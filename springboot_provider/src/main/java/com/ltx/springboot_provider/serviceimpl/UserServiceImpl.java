package com.ltx.springboot_provider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ltx.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @Program: dubbo_ltx
 * @ClassName: UserServiceImpl
 * @Author: 李腾旭
 * @Date: 2020-07-12 11:39
 * @Description: ${todo}
 * @Version: V1.0
 */
@Component
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public String hello() {
        return "hello ,dubbo";
    }
}
