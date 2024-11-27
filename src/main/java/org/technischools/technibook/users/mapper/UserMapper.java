package org.technischools.technibook.users.mapper;

import org.springframework.stereotype.Component;
import org.technischools.technibook.users.User;
import org.technischools.technibook.users.api.CreateUserRequest;
import org.technischools.technibook.users.api.GetUserResponse;

import java.util.Date;
import java.util.UUID;

@Component
public class UserMapper {
    public GetUserResponse mapToGetUserResponse(User user){
        return GetUserResponse.builder()
                .uuid(user.getUuid())
                .birthDate(user.getBirthDate())
                .name(user.getName())
                .surname(user.getSurname())
                .email(user.getEmail())
                .sex(user.isSex())
                .build();
    }

    public User mapToUser(CreateUserRequest createUserRequest){
        return User.builder()
                .createdDate(new Date())
                .uuid(UUID.randomUUID().toString())
                .email(createUserRequest.getEmail())
                .password(createUserRequest.getPassword())
                .activated(false)
                .name(createUserRequest.getName())
                .surname(createUserRequest.getSurname())
//                .birthDate(createUserRequest.getBirthDate())
                .sex(createUserRequest.isSex())
                .build();
    }
}
