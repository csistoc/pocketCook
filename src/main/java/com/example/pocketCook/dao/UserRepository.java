package com.example.pocketCook.dao;


import com.example.pocketCook.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Transactional
    @Modifying
    @Query("update User u set u.password = :password where u.id = :id")
    void updatePassword(@Param("id") Long id, @Param("password") String password);

    @Transactional
    @Modifying
    @Query("update User u set u.email = :email where u.id = :id")
    void updateEmail(@Param("id") Long id, @Param("email") String email);

    @Transactional
    @Modifying
    @Query("update User u set u.role = :role where u.id = :id")
    void updateRole(@Param("id") Long id, @Param("role") int role);

    List<User> getByUsername(String username);

    List<User> getByUserId(Long userId);

    void deleteByUserId(Long userId);
}
