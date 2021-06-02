package com.example.pocketCook.controller;

import com.example.pocketCook.dto.CreateUserDto;
import com.example.pocketCook.dto.UserTestingDto;
import com.example.pocketCook.entity.User;
import com.example.pocketCook.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.*;
import java.util.stream.Collectors;

@RequestMapping("/user")
@RestController
//localhost:8080/user
public class UserController {

    private UserService userService;
    private ModelMapper modelMapper = new ModelMapper();

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserTestingDto> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return users.stream()
                .map(this::convertToUserTestingDto)
                .collect(Collectors.toList());
    }

    @PostMapping
    public void addUser(@RequestBody CreateUserDto createUserDto) {
        userService.addUser(convertCreateUserDtoToEntity(createUserDto));
    }

    @PutMapping("/updateEmail/{id}")
    public void updateEmail(@PathVariable @Valid @Min(0) Long id, @RequestParam String email) {
        userService.updateEmail(id, email);
    }

    @PutMapping("/updatePassword/{id}")
    public void updatePassword(@PathVariable @Valid @Min(0) Long id, @RequestParam String password) {
        userService.updatePassword(id, password);
    }

    @PutMapping("/updateRole/{id}")
    public void updateRole(@PathVariable @Valid @Min(0) Long id, @RequestParam Integer role) {
        userService.updateRole(id, role);
    }

    @GetMapping("/getProfile/{userId}")
    public List<UserTestingDto> getProfile(@PathVariable @Valid @Min(0) Long userId) {
        List<User> users = userService.getProfile(userId);
        return users.stream()
                .map(this::convertToUserTestingDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/searchUser/{username}")
    public List<UserTestingDto> searchUser(@PathVariable @Valid String username) {
        List<User> users = userService.searchUser(username);
        return users.stream()
                .map(this::convertToUserTestingDto)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/{userId}")
    @Transactional
    public void deleteAccount(@PathVariable Long userId) {
        userService.deleteAccount(userId);
    }


    // internal conversion methods //

    private UserTestingDto convertToUserTestingDto(User user) {
        return modelMapper.map(user, UserTestingDto.class);
    }

    private CreateUserDto convertToCreateUserDto(User user) {
        return modelMapper.map(user, CreateUserDto.class);
    }

    private User convertCreateUserDtoToEntity(CreateUserDto createUserDto) {
        return modelMapper.map(createUserDto, User.class);
    }

    private User convertUserTestingDtoToEntity(UserTestingDto userTestingDto) {
        return modelMapper.map(userTestingDto, User.class);
    }
}
