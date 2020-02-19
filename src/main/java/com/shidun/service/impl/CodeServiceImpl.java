package com.shidun.service.impl;

import com.shidun.dao.CodeMapper;
import com.shidun.model.Code;
import com.shidun.model.CodeExample;
import com.shidun.service.CodeSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CodeServiceImpl implements CodeSerice {
    @Autowired
    CodeMapper codeMapper;

    @Override
    public boolean addCode(String issue, String code, String lottery) {
        Code codes = new Code();
        codes.setCode(code);
        codes.setCreateTime(new Date());
        codes.setIssue(issue);
        codes.setLottery(lottery);
        boolean result = codeMapper.insert(codes) > 0;
        return result;
    }

    @Override
    public Code queryCode(String issue, String lottery) {
        CodeExample codeExample = new CodeExample();
        codeExample.createCriteria().andIssueEqualTo(issue).andLotteryEqualTo(lottery);
        List<Code> list = codeMapper.selectByExample(codeExample);
        if (list.isEmpty()) {
            return new Code();
        }
        return list.get(0);
    }
}
