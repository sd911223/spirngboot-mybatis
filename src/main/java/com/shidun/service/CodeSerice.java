package com.shidun.service;

import com.shidun.model.Code;

public interface CodeSerice {
    boolean addCode(String issue, String code, String lottery);

    Code queryCode(String issue, String lottery);
}
