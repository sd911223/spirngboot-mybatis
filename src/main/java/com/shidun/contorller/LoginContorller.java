package com.shidun.contorller;

import com.shidun.model.UserTab;
import com.shidun.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/user")
@Api(tags = "测试")
public class LoginContorller {
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation("登录")
    public String login(@RequestParam(name = "userAccount") String userName, @RequestParam(name = "password") String password) {
        log.info("进入登录");
        List<UserTab> userTab=loginService.login(userName,password);
        if (userTab.size()>0){
            log.info("登录成功");
        }
        return "登录成功!";
    }
}
