package com.example.Employee.Details.Controller;

import com.example.Employee.Details.Entity.StaffEntity;
import com.example.Employee.Details.Service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Controller
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    //to show employee register form
    @GetMapping("/addStaff")
    public String staffRegister(){
        return "addStaff";
    }

    //addEmployeeDetails
    @PostMapping(value = "/save")
    public String saveStaff(@ModelAttribute StaffEntity staff){
        staffService.saveEmployee(staff);
        return "redirect:/";
    }


    //Method to Display All the Staff Details
    @GetMapping(value ="/displayStaffDetails")
    public String getAllStaffDetails(Model model){
        List<StaffEntity>staffList=staffService.getAllStaff();
        model.addAttribute("staff",staffList );
        return "showEmployee";
    }


    // Method to display the employee search form
    @GetMapping("/findStaffById")
    public String findEmployeePage() {
        return "findEmpById";
    }

    // Method to handle the employee search request by ID
    @GetMapping("/findEmpById")
    public String findStaffById(@RequestParam int employeeId, Model model) {
        Optional<StaffEntity> staffList = staffService.findByStaffId(employeeId);
        if(staffList.isEmpty()){
            model.addAttribute("error","Employee Credential NOT FOUND!");
            return "error";

        }else{
            model.addAttribute("staff",staffList.get());
            return "showEmployee";
        }



    }



}