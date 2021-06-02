package com.example.pocketCook.dto;

public class UserTestingDto {

    private Long userId;

    private String name;

    private String surname;

    private String username;

    private String password;

    private String email;

    private Integer role;

    public UserTestingDto() { }

    public UserTestingDto(Long userId, String name, String surname, String username, String password, String email, Integer role) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        /*
        if (role == 1)
            this.role = UserRoleType.ADMIN;
        else this.role = UserRoleType.REGULAR;
         */
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
