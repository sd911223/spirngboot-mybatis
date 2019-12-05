package com.shidun.service;

import com.shidun.model.UserTab;

import java.util.List;

public interface LoginService {
    List<UserTab> login(String userName, String password);
}
