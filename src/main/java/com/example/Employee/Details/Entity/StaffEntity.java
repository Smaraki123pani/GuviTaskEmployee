package com.example.Employee.Details.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "StaffDetails")          //For MONGO ENTITY
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffEntity {

    @Id
    private int employeeId;

    private String employeeName;
    private String employeeEmail;
    private String location;

    //GETTER and Setter, Constructor, toString() handled by LOMBOK



}