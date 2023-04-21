package com.example.infrastructure.mybatis;

import java.util.List;
public interface UserMapper {
    List<User> selectAllUsers();
    void updateUser(User user);
}
