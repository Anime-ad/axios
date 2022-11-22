package com.liang.service.imp;

import com.liang.dao.UserMapper;
import com.liang.pojo.User;
import com.liang.utils.GsonUtil;
import com.liang.utils.MybatisUtil;
import org.junit.Test;

import java.util.List;

/**
 * @author Beyond
 * @date 2022/11/13
 */
public class UserImplementation implements com.liang.service.User {
    UserMapper userMapper;
    GsonUtil gsonUtil;
    @Test
    public List<User> selectUser() {
        userMapper = MybatisUtil.cnn().getMapper(UserMapper.class);
        List<User> list = userMapper.selectList(null);
        System.out.println(list);

        return list;
    }
    @Test
    public void insertUser() {
        userMapper = MybatisUtil.cnn().getMapper(UserMapper.class);
        int insert = userMapper.insert(new User("两", "lkehalkej"));
        if (insert == 1) {
            System.out.println("插入成功");
        }
    }


}
