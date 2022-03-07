package controllers;

import Dao.entity.StaffModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.StaffService;

@RestController
public class StaffController {

    @Autowired
    StaffModel staffModel;

    @Autowired
    StaffService staffService;

    @RequestMapping("/addStaff")
    public String hello(){
        staffModel = new StaffModel();
        staffModel.setEmail("email@gmail.com");
        staffModel.setId(1);
        staffModel.setPhone("092323232");
        staffModel.setPosition("manager");

        staffService.addStaff(staffModel);

        return "Add New Staff Success";
    };
}
