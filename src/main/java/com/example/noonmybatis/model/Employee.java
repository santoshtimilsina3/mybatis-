package com.example.noonmybatis.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private Long phone;
    private Long deptId;
    private Department department;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(phone, employee.phone) && Objects.equals(deptId, employee.deptId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, deptId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", deptId=" + deptId +
                ", department=" + department +
                '}';
    }
}
