package org.technischools.technibook.users;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Builder
@Data
@Document("users")
public class User {
    @Id
    private String id;
    private Date createdDate;
    private Date updatedDate;
    private String uuid;
    private String email;
    private String password;
    private boolean activated;
    private String name;
    private String surname;
    private Date birthDate;
    private boolean sex;
}
