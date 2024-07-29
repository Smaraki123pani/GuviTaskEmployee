package com.example.Employee.Details.Repository;


import com.example.Employee.Details.Entity.StaffEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface StaffRepository extends MongoRepository<StaffEntity,Integer> {

    //Method for findById
    Optional<StaffEntity> findById(int employeeId);
}
