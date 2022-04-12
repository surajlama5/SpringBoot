package com.dailycodebuffer.springbootproject.service;

import com.dailycodebuffer.springbootproject.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    public Department getDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}
