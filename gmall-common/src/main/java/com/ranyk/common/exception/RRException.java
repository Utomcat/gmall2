package com.ranyk.common.exception;

import java.io.Serial;

/**
 * 自定义异常
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <a href="https://www.renren.io">人人开源</a>
 * 版权所有，侵权必究！
 *
 * @author Mark sunlightcs@gmail.com
 */
@SuppressWarnings("all")
public class RRException extends RuntimeException {
    @Serial
	private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public RRException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public RRException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public RRException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public RRException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


}
