package controllers;

import dto.request.StaffRequest;
import dto.response.StaffResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.StaffService;

import java.util.List;
import java.util.Map;

@RestController
public class StaffController {

    @Autowired
    StaffService staffService;

    @GetMapping("/findAll")
    public List<Map<String, Object>> findStaff(){
        return staffService.findAllStaff();
    };

    @PostMapping("/addStaff")
    public StaffResponse createStaff(@RequestBody StaffRequest staffRequest){
        staffService.addStaff(staffRequest);

        return null;
    };

    @DeleteMapping("/delete")
    public String deleteStaff(@RequestBody StaffRequest staffRequest){
        staffService.deleteStaff(staffRequest);

        return "delete success";
    }
}
