package com.shidun.service.impl;

import com.shidun.service.LoginService;
import com.shidun.dao.UserTabMapper;
import com.shidun.model.UserTab;
import com.shidun.model.UserTabExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserTabMapper userTabMapper;

    @Override
    public List<UserTab> login(String userName, String password) {
        UserTabExample example = new UserTabExample();
        example.createCriteria().andUserNameEqualTo(userName).andPasswordEqualTo(password);
        List<UserTab> tabs = userTabMapper.selectByExample(example);
        return tabs;
    }
}
