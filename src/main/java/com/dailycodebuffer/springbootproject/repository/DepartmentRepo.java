package com.dailycodebuffer.springbootproject.repository;

import com.dailycodebuffer.springbootproject.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

    public Department findBydepartmentName(String departmentName);
}
