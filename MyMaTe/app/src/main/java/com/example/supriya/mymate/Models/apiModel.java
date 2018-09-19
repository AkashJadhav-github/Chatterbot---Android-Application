package com.example.supriya.mymate.Models;

/**
 * Created by supriya on 27/7/17.
 */

public class apiModel {
    public String response;
    public String id;
    public int result;
    public String msg;

    public apiModel(String response,String id,int result,String msg)
    {
        this.response=response;
        this.result=result;
        this.id=id;
        this.msg=msg;
    }

    public apiModel(){}

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
