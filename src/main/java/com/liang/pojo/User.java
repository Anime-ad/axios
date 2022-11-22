package com.liang.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Beyond
 * @date 2022/11/13
 */
@Data
@AllArgsConstructor
@TableName(value = "user")
public class User {
    private String name;
    private String pwd;

    @Override
    public String toString() {
          StringBuffer sb = new StringBuffer( "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}');
          return sb.toString();
    }
}
