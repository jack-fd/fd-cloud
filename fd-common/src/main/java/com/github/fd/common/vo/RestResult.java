package com.github.fd.common.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 返回结果封装
 *
 * @author fd
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RestResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final int OK = 200;
    private static final String M_OK = "成功";
    private static final int ERROR = 500;
    private static final String M_ERROR = "未知异常，请联系管理员";

    /**
     * 错误号码
     */
    private int code;

    /**
     * 错误消息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    public static <T> RestResult<T> ok(T data) {
        RestResult<T> restResult = new RestResult<>();
        restResult.setCode(OK);
        restResult.setMessage(M_OK);
        restResult.setData(data);
        return restResult;
    }

    public static RestResult<String> error() {
        return error(M_ERROR);
    }

    public static RestResult<String> error(String message) {
        return error(ERROR, message);
    }

    public static RestResult<String> error(int code, String message) {
        RestResult<String> restResult = new RestResult<>();
        restResult.setCode(code);
        restResult.setMessage(message);
        return restResult;
    }
}
