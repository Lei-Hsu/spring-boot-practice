package Dao.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Component
@Table(name="staffInfo")
public class StaffModel {

    @Column(name="`id`")
    private int id;

    @Column(name="`email`")
    private String email;

    @Column(name="`phone`")
    private String phone;

    @Column(name="`password`")
    private String password;

    @Column(name="`position`")
    private String position;
}
