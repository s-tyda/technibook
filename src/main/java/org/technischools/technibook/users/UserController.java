package org.technischools.technibook.users;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.technischools.technibook.users.api.CreateUserRequest;
import org.technischools.technibook.users.api.GetUserResponse;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping("")
    public User createUser(@RequestBody CreateUserRequest createUserRequest){
        return userService.createUser(createUserRequest);
    }

    @GetMapping("/{uuid}")
    public GetUserResponse getUser(@PathVariable("uuid") String uuid){
        return userService.getUser(uuid);
    }

}
