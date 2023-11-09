package com.example.noonmybatis.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User
{
 private Integer userId;
 private String emailId;
 private String password;
 private String firstName;
 private String lastName;

 @Override
 public String toString() {
  return "User{" +
          "userId=" + userId +
          ", emailId='" + emailId + '\'' +
          ", password='" + password + '\'' +
          ", firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          '}';
 }

}