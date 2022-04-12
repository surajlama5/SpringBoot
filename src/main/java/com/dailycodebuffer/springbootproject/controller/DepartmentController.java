package com.dailycodebuffer.springbootproject.controller;


import com.dailycodebuffer.springbootproject.entity.Department;
import com.dailycodebuffer.springbootproject.service.DepartmentService;
import com.dailycodebuffer.springbootproject.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){

        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId,
                                           @RequestBody Department department){

        return departmentService.updateDepartmentById(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){

        return departmentService.fetchDepartmentByName(departmentName);
    }
}
