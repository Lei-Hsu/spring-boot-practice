package services;

import Dao.entity.StaffModel;
import Dao.repository.StaffRepository;
import dto.request.StaffRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Service
public class StaffService {

    @Autowired
    StaffRepository staffRepository;

    @Autowired
    StaffModel staffModel;

    private List<Map<String, Object>> staffList;

    public List<Map<String, Object>> findAllStaff(){
        staffList = staffRepository.findAllStaff();

        return staffList;
    }


    public void addStaff(@RequestBody StaffRequest staffRequest){

        staffModel = new StaffModel();
        staffModel.setEmail(staffRequest.getEmail());
        staffModel.setId(staffRequest.getId());
        staffModel.setPhone(staffRequest.getPhone());
        staffModel.setPosition(staffRequest.getPosition());

        staffRepository.addStaff((staffModel));
    }

    public void deleteStaff(@RequestBody StaffRequest staffId){

        staffModel = new StaffModel();
        staffModel.setId(staffId.getId());
        staffRepository.deleteStaff(staffModel.getId());
    }
}
