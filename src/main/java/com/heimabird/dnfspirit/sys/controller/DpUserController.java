package com.heimabird.dnfspirit.sys.controller;


import com.heimabird.dnfspirit.sys.entity.DpUser;
import com.heimabird.dnfspirit.sys.entity.Result;
import com.heimabird.dnfspirit.sys.service.impl.DpUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author HelloBird
 * @since 2019-08-24
 */
@RestController
@RequestMapping("/sys/dp-user")
public class DpUserController {
    @Autowired
    Result result;

    @Autowired
    DpUserServiceImpl userService;

    @RequestMapping("/add")
    public Result addUser(DpUser user) {
        DpUser dpUser = userService.getById(user.getId());
        if (dpUser != null) {
            result.setStatus("100");
            result.setMessage("用户已存在");
        } else {
            userService.save(user);
            result.setStatus("200");
            result.setMessage("成功");
        }
        return result;

    }

}
