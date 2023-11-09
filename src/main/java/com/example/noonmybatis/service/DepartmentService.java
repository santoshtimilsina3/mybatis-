package com.example.noonmybatis.service;

import com.example.noonmybatis.config.MyBatisUtil;
import com.example.noonmybatis.mappers.DepartmentMapper;
import com.example.noonmybatis.model.Department;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DepartmentService {
    public List<Department> getAllDepartment() {
        try (SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession()) {
            session.commit();
            DepartmentMapper departmentMapper = session.getMapper(DepartmentMapper.class);
            return departmentMapper.getAllDepartments();
        }
    }
}
