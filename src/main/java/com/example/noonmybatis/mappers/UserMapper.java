package com.example.noonmybatis.mappers;

import com.example.noonmybatis.model.User;

import java.util.List;

public interface UserMapper
{
 
 public int insertUser(User user);
 
 public User getUserById(Integer userId);
 
 public List<User> getAllUsers();
 
 public void updateUser(User user);
 
 public void deleteUser(int userId);
 
}