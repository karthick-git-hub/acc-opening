package com.ao.model;

public class JsonResponse<T> {
    private T data;

    public  JsonResponse (T data){
        this.data = data;
    }

    public T getData() {
        return  this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
