package Dao.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class StaffModel {
    private int id;
    private String email;
    private String phone;
    private String password;
    private String position;
}
