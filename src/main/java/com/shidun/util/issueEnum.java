package com.shidun.util;

public enum issueEnum {

    TXFFC("txffc", "腾讯分分彩"),
    WXFFC("wxffc", "微信分分彩"),
    OCQSSC("ocqssc", "旧重庆时时彩"),
    JSXYFT("jsxyft", "极速幸运飞艇"),
    JSXYST("jsxyst", "极速幸运赛艇"),
    OBJPK10("objpk10", "旧北京PK10");


    /**
     * 业务编码
     */
    private String code;
    /**
     * 提示信息
     */
    private String message;

    issueEnum(String code, String meseage) {
        this.code = code;
        this.message = meseage;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
