package com.example.demo.handler;

public class ResultUtil {

    public ResultEntity returnSuccess() {
        return new ResultEntity();
    }

    public ResultEntity returnSuccess(String msg, Object result) {
        ResultEntity response = new ResultEntity();
        response.setMsg(msg);
        response.setData(result);
        return response;
    }

    public ResultEntity returnSuccess(Object result) {
        ResultEntity response = new ResultEntity();
        response.setData(result);
        return response;
    }

    public ResultEntity returnSuccess(String msg) {
        ResultEntity response = new ResultEntity();
        response.setMsg(msg);
        return response;
    }

    public ResultEntity returnException() {
        ResultEntity response = new ResultEntity();
        response.setSuccess(false);
        return response;
    }

    public ResultEntity returnException(String msg) {
        ResultEntity response = new ResultEntity();
        response.setSuccess(false);
        response.setMsg(msg);
        return response;
    }

    public ResultEntity returnException(Object result) {
        ResultEntity response = new ResultEntity();
        response.setSuccess(false);
        response.setData(result);
        return response;
    }

    public ResultEntity returnException(String msg, Object result) {
        ResultEntity response = new ResultEntity();
        response.setSuccess(false);
        response.setData(result);
        response.setMsg(msg);
        return response;
    }
}
