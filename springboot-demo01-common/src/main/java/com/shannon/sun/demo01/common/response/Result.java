package com.shannon.sun.demo01.common.response;

import java.io.Serializable;
import java.util.List;

/**
 * @author xibin sun
 */
public class Result<T> {
    /**
     * DEFAULT_CODE_SUCCESS
     */
    public static final String DEFAULT_CODE_SUCCESS = "200";

    /**
     * DEFAULT_CODE_FAILURE
     */
    public static final String DEFAULT_CODE_FAILURE = "500";

    /**
     * CODE_FAILURE_404
     */
    public static final String CODE_FAILURE_404 = "404";

    /**
     * success tag
     */
    private final boolean success;

    /**
     * data
     */
    private final T data;

    /**
     * message
     */
    private final String message;

    /**
     * code
     */
    private final String code;


    public Result(boolean success, T data, String message, String code) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getCode() {
        return code;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    //---- static methods starts here -----------

    public static <T> Result<T> build(String code, T data, String message, boolean success) {
        return new Result<T>(success, data, message, code);
    }

    public static <T> Result<T> success(T data, String message) {
        return new Result<T>(true, data, message, DEFAULT_CODE_SUCCESS);
    }

    public static <T> Result<T> success(T data) {
        return new Result(true, data, null, DEFAULT_CODE_SUCCESS);
    }

    public static Result<Void> success() {
        return new Result<Void>(true, null, null, DEFAULT_CODE_SUCCESS);
    }

    public static Result<Void> failure(String message) {
        return new Result(false, null, message, DEFAULT_CODE_FAILURE);
    }

    public static Result<Void> failure(String message, String code) {
        if (code == null) {
            code = DEFAULT_CODE_FAILURE;
        }
        return new Result(false, null, message, code);
    }
}
