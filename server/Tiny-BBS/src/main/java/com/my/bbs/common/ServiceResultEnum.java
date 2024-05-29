package com.my.bbs.common;

public enum ServiceResultEnum {
    ERROR("error"),

    SUCCESS("success"),

    DATA_NOT_EXIST("未查询到记录！"),

    SAME_LOGIN_NAME_EXIST("用户名已存在！"),

    LOGIN_NAME_NULL("请输入登录名！"),

    LOGIN_NAME_NOT_EMAIL("请输入正确的邮箱！"),

    LOGIN_PASSWORD_NULL("请输入密码！"),

    LOGIN_VERIFY_CODE_NULL("请输入验证码！"),

    LOGIN_VERIFY_CODE_ERROR("验证码错误！"),

    LOGIN_ERROR("登录失败！"),

    DB_ERROR("database error");

    private String result;

    ServiceResultEnum(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
