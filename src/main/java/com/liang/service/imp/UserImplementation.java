package com.liang.service.imp;

import com.liang.dao.UserMapper;
import com.liang.pojo.Users;
import com.liang.service.UserService;
import com.liang.utils.GsonUtil;
import com.liang.utils.MybatisUtil;
import java.util.List;

/**
 * @author Beyond
 * @date 2022/11/13
 */
public class UserImplementation implements UserService {
    UserMapper userMapper;
    GsonUtil gsonUtil;
    public List<Users> selectUser() {
        userMapper = MybatisUtil.cnn().getMapper(UserMapper.class);
        List<Users> list = userMapper.selectList(null);
        System.out.println(list);
        return list;
    }
    public int insertUser(int id ,String username ,String password) {
        userMapper = MybatisUtil.cnn().getMapper(UserMapper.class);
        int insert = userMapper.insert(new Users(id,username,password,0));
        return insert;
    }


}
