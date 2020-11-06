package com.hopu.controller;



public class Result {
    private int code;// 相应结果状态码
    private String msg;    // 相应结果信息（通常错误的时候才会有）
    private Object data;   // 相应数据（通常是正确返回，且有结果的时候）
    // 省略get，set方法


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result() {
    }

    @Override
    public String toString() {
        return "result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
