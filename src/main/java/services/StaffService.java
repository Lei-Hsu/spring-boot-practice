package services;

import Dao.entity.StaffModel;
import Dao.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    @Autowired
    StaffRepository staffRepository;
    public void addStaff(StaffModel staffModel){
        staffRepository.addStaff((staffModel));
    }
}
