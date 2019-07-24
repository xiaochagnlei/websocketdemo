package com.vivedu.websocketdemo;

public class ApiReturnUtil {

    public static <T> ApiReturnObject success(T t) {
        return new ApiReturnObject(t);
    }

    public static <T> ApiReturnObject error(T t) {
        return new ApiReturnObject(t);
    }


}

