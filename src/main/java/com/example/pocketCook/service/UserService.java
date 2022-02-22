package com.example.pocketCook.service;

import com.example.pocketCook.dao.UserRepository;
import com.example.pocketCook.entity.User;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public void addUser(User user) {
        user.setRole(0); // every user created is made non-admin by default
        userRepository.save(user);
    }

    public void updateEmail(Long id, String email) {
        userRepository.updateEmail(id, email);
    }

    public void updatePassword(Long id, String password) {
        userRepository.updatePassword(id, password);
    }

    public void updateRole(Long id, Integer role) { userRepository.updateRole(id, role); }

    public List<User> getProfile(Long userId) {
        return userRepository.getById(userId);
    }

    public List<User> searchUser(String username) { return userRepository.getByUsername(username); }

    public void deleteAccount(Long userId) {
        userRepository.deleteById(userId);
    }
}
