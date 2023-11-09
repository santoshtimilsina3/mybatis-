package com.example.noonmybatis.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {

    private static SqlSession session;

    private MyBatisUtil() {
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        if (session == null) return getSqlSession();
        return (SqlSessionFactory) session;

    }

    private static SqlSessionFactory getSqlSession() {
        InputStream inputStream = null;

        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

}