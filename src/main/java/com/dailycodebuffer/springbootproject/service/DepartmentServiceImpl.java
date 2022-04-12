package com.dailycodebuffer.springbootproject.service;

import com.dailycodebuffer.springbootproject.entity.Department;
import com.dailycodebuffer.springbootproject.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepo.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepo.deleteById(departmentId);
    }

    @Override
    public Department updateDepartmentById(Long departmentId, Department department) {
         Department department1 = departmentRepo.findById(departmentId).get();

         if(Objects.nonNull(department.getDepartmentName()) &&
          !"".equalsIgnoreCase(department.getDepartmentName())){
             department1.setDepartmentName(department.getDepartmentName());
         }

        if(Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())){
            department1.setDepartmentCode(department.getDepartmentCode());
        }

        if(Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())){
            department1.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepo.save(department1);

    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepo.findBydepartmentName(departmentName);
    }


}
