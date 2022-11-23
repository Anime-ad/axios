package com.liang.service;

import com.liang.pojo.Users;

import java.util.List;

/**
 * @author Beyond
 * @date 2022/11/13
 */
public interface UserService {
    List<Users> selectUser();
    int insertUser(int id ,String username ,String password);
}
