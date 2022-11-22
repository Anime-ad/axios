package com.liang.utils;

import com.google.gson.Gson;

/**
 * @author Beyond
 * @date 2022/11/14
 */
public class GsonUtil {
   static Gson gson = new Gson();

    public String beanToJson(Object object){
        String s = gson.toJson(object);
        return s;
    }

    public <T> T jsonToBean(String json, Class<T> obj){
        T t = null;
        t = gson.fromJson(json,obj);
        return t;
    }




}
