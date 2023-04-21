package com.example.infrastructure.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.App;

public class Example {
    public static void updateUser(User u) throws IOException {
         // ★ルートとなる設定ファイルを読み込む
         try (InputStream in = App.class.getResourceAsStream("/mybatis-config.xml")) {
            // ★設定ファイルを元に、 SqlSessionFactory を作成する
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

            // ★SqlSessionFactory から SqlSession を生成する
            try (SqlSession session = factory.openSession()) {
                // ★SqlSession を使って SQL を実行する
                UserMapper userMapper = session.getMapper(UserMapper.class);
                    userMapper.updateUser(u);
                    session.commit();
                }
            }
        }
    
    public static void getUser() throws IOException {
        // ★ルートとなる設定ファイルを読み込む
        try (InputStream in = App.class.getResourceAsStream("/mybatis-config.xml")) {
        // ★設定ファイルを元に、 SqlSessionFactory を作成する
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        // ★SqlSessionFactory から SqlSession を生成する
        try (SqlSession session = factory.openSession()) {
            // ★SqlSession を使って SQL を実行する
            UserMapper userMapper = session.getMapper(UserMapper.class);
            List<User> userList = userMapper.selectAllUsers();
            for (User user : userList) {
                System.out.println(user.getId() + " " + user.getName() + " " + user.getEmail());
                String name = String.format("%s:%s",user.getName(), user.getId() +1);
                User updatedUser = new User(user.getId(), name, user.getEmail());
                updateUser(updatedUser);
                session.commit();
            }
        }
    }
  }
}
