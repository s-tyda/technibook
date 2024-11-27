package org.technischools.technibook.users.api;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class GetUserResponse {
    private String uuid;
    private String email;
    private String name;
    private String surname;
    private Date birthDate;
    private boolean sex;
}
