package com.example.demo.handler;

import java.io.Serializable;

public class ResultEntity implements Serializable {
    private static final long serialVersionUID = -5207285996548676020L;
    private boolean success = true;
    private String msg;
    private Object data;
    private String stackTrace;
    private String code = "0";

    public ResultEntity() {
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getStackTrace() {
        return this.stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String toString() {
        return "ResultEntity [success=" + this.success + ", msg=" + this.msg + ", data=" + this.data + ", stackTrace=" + this.stackTrace + ", errorCode=" + this.code + "]";
    }
}