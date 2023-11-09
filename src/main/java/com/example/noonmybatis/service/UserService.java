package com.example.noonmybatis.service;

import com.example.noonmybatis.config.MyBatisUtil;
import com.example.noonmybatis.mappers.UserMapper;
import com.example.noonmybatis.model.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class UserService {
    public int insertUser(User user) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int insertedId = userMapper.insertUser(user);
            sqlSession.commit();
            return insertedId;
        }
    }

    public User getUserById(Integer userId) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.getUserById(userId);
        }
    }

    public List<User> getAllUsers() {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.getAllUsers();

        }
    }

    public void updateUser(User user) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.updateUser(user);
            sqlSession.commit();
        }

    }

    public void deleteUser(Integer userId) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.deleteUser(userId);
            sqlSession.commit();
        }
    }

}