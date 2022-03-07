package services;

import Dao.entity.StaffModel;
import Dao.repository.StaffRepository;
import dto.request.StaffRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StaffService {

    @Autowired
    StaffRepository staffRepository;

    @Autowired
    StaffModel staffModel;

    public void addStaff(@RequestBody StaffRequest staffRequest){

        staffModel = new StaffModel();
        staffModel.setEmail(staffRequest.getEmail());
        staffModel.setId(staffRequest.getId());
        staffModel.setPhone(staffRequest.getPhone());
        staffModel.setPosition(staffRequest.getPosition());

        staffRepository.addStaff((staffModel));
    }
}
