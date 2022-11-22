package com.liang.utils;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Beyond
 * @date 2022/11/13
 */
public class MybatisUtil {
    static public SqlSession cnn()  {
        String resource = "mybatis.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory factory = new MybatisSqlSessionFactoryBuilder().build(inputStream);
       return factory.openSession(true);
    }

}
