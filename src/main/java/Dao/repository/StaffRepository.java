package Dao.repository;

import Dao.entity.StaffModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class StaffRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> findAllStaff(){
        return jdbcTemplate.queryForList("SELECT id, email, phone, position from staffInfo");
    }

    public void addStaff(StaffModel staffModel){
        System.out.println("Execute Insert Member");
        jdbcTemplate.update("INSERT INTO staffInfo(PASSWORD, EMAIL, POSITION, PHONE, CREATE_DATE) "
                        + "VALUES (?,?,?,?,NOW())",staffModel.getPassword(), staffModel.getEmail(),
                staffModel.getPosition(),staffModel.getPhone());
    }
}
