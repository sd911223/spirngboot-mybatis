package com.shidun.service;

import com.shidun.model.Code;
import com.shidun.model.PhoneNum;

public interface CodeSerice {
    boolean addCode(String issue, String code, String lottery);

    Code queryCode(String issue, String lottery);

    PhoneNum queryPhone(String phoneNum);
}
