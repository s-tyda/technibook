package org.technischools.technibook.users.api;

import lombok.Data;

import java.util.Date;

@Data
public class CreateUserRequest {
    private String email;
    private String password;
    private String name;
    private String surname;
//    private Date birthDate;
    private boolean sex;
}
