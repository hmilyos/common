package com.hmily.dubbo.common.util;


public enum ResponseCode {
    SUCCESS(200, "SUCCESS"),
    ERROR(500, "ERROR"),
    NEED_LOGIN(10, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT"),
    OTHER(-1, "UN_KNOW_ERROR");

    private final int code;
    private final String desc;

    ResponseCode(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
