package com.pactera.model;

public class RespBean {
    private Integer code;
    private String message;
    private Object content;

    private RespBean(Integer code, String message, Object content) {
        this.code = code;
        this.message = message;
        this.content = content;
    }

    public static RespBean ok(String message,Object content){
        return new RespBean(200,message,content);
    }
    public static RespBean ok(String message){
        return new RespBean(200,message,null);
    }
    public static RespBean error(String message){
        return new RespBean(500,message,null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
