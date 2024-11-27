package org.technischools.technibook.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.technischools.technibook.users.api.CreateUserRequest;
import org.technischools.technibook.users.api.GetUserResponse;
import org.technischools.technibook.users.mapper.UserMapper;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User createUser(CreateUserRequest createUserRequest) {
        User newUser = userMapper.mapToUser(createUserRequest);
        return userRepository.save(newUser);
    }

    public GetUserResponse getUser(String uuid) {
        User user = userRepository.findByUuid(uuid);
        return userMapper.mapToGetUserResponse(user);
    }
}
