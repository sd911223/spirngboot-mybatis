package com.shidun.contorller;

import com.shidun.model.Code;
import com.shidun.model.PhoneNum;
import com.shidun.service.CodeSerice;
import com.shidun.util.Msg;
import com.shidun.util.ResultUtil;
import com.shidun.util.issueEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@Slf4j
@RequestMapping(value = "/lottery")
@Api(tags = "彩票添加")
public class AddCodeContorller {
    @Autowired
    CodeSerice codeSerice;

    @ApiOperation("添加开奖号码")
    @RequestMapping(value = "/addCode", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "issue", value = "期号", required = true),
            @ApiImplicitParam(name = "code", value = "开奖号码", required = true),
            @ApiImplicitParam(name = "lottery", value = "彩票", required = true)
    })
    public Msg addCode(String issue, String code, issueEnum lottery) {
        if ("".equals(issue) || null == issue) {
            log.error("期数为空!");
            ResultUtil.error(400, "期数不能为空!");
        }
        if ("".equals(code) || null == code) {
            log.error("开奖号码为空!");
            ResultUtil.error(400, "开奖号码不能为空!");
        }
        if (null == lottery) {
            log.error("彩票为空!");
            ResultUtil.error(400, "彩票不能为空!");
        }
        log.info("添加彩票:期数:{},开奖号码{},彩票{}", issue, code, lottery);
        boolean result = codeSerice.addCode(issue, code, lottery.getCode());
        return ResultUtil.success(result);
    }

    @ApiOperation("查询开奖号码")
    @RequestMapping(value = "/queryCode", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "issue", value = "期号", required = true),
            @ApiImplicitParam(name = "lottery", value = "彩票", required = true)
    })
    public String queryCode(String issue, String lottery) {
        if ("".equals(issue) || null == issue) {
            log.error("期数为空!");
            ResultUtil.error(400, "期数不能为空!");
        }
        if ("".equals(lottery) || null == lottery) {
            log.error("彩票为空!");
            ResultUtil.error(400, "彩票号码不能为空!");
        }
        Code code = codeSerice.queryCode(issue, lottery);
        if (Objects.isNull(code)) {
            return "";
        }
        return code.getCode();
    }

    @ApiOperation("查询手机号码")
    @RequestMapping(value = "/queryPhone", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phoneNum", value = "手机号", required = true)
    })
    public String queryPhone(String phoneNum) {
        if ("".equals(phoneNum) || null == phoneNum) {
            log.error("手机号不能空!");
            ResultUtil.error(400, "期数不能为空!");
        }
        PhoneNum num = codeSerice.queryPhone(phoneNum);
        if (Objects.isNull(phoneNum)) {
            return "无";
        }
        return num.getMobileNum();
    }


}
