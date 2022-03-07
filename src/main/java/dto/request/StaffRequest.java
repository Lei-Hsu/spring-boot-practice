package dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class StaffRequest {

    private int id;

    private String email;

    private String phone;

    private String password;

    private String position;

}
