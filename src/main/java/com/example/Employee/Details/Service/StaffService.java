package com.example.Employee.Details.Service;

import com.example.Employee.Details.Entity.StaffEntity;
import com.example.Employee.Details.Repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    //to add employee
    public StaffEntity saveEmployee(StaffEntity staffEntity){
        return  staffRepository.save(staffEntity);
    }

    //Method to Display Product From Database
    public List<StaffEntity> getAllStaff(){
        return staffRepository.findAll();
    }

    //Method to find Employee by ID
    public Optional<StaffEntity> findByStaffId(int employeeId){
        return staffRepository.findById(employeeId);
    }
}