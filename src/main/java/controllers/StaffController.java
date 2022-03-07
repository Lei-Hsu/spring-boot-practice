package controllers;

import Dao.entity.StaffModel;
import dto.request.StaffRequest;
import dto.response.StaffResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.StaffService;

@RestController
public class StaffController {

    @Autowired
    StaffService staffService;

    @GetMapping("/find")
    public String findStaff(){
        return "findStaff";
    }

    @PostMapping("/addStaff")
    public StaffResponse createStaff(@RequestBody StaffRequest staffRequest){
        staffService.addStaff(staffRequest);

        return null;
    };
}
