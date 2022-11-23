package com.liang.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Beyond
 * @date 2022/11/13
 */
@Data
@AllArgsConstructor
@TableName(value = "users")
public class Users {
    @TableId
    private Integer id;
    private String username;
    private String password;
    private Integer jursidiction;
    @Override
    public String toString() {
          StringBuffer sb = new StringBuffer("User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", jursidiction=" + jursidiction +
                '}');
          return sb.toString();
    }
}
