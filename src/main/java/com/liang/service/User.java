package com.liang.service;

import java.util.List;

/**
 * @author Beyond
 * @date 2022/11/13
 */
public interface User {
    List<com.liang.pojo.User> selectUser();
    void insertUser();
}
