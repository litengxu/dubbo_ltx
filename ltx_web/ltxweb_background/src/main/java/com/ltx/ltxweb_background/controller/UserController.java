package com.ltx.ltxweb_background.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ltx.ltxweb_api.IUserService;
import org.springframework.web.bind.annotation.*;

/**
 * @Program: dubbo_ltx
 * @ClassName: UserController
 * @Author: 李腾旭
 * @Date: 2020-07-13 20:11
 * @Description: ${todo}
 * @Version: V1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private IUserService iUserService;

    @GetMapping("getUser/{account}")
    @ResponseBody
    public Object findAll(@PathVariable String account){

        System.out.println(account);
        System.out.println(iUserService.selectBycount(account));
        return iUserService.selectBycount(account);
    }
}
