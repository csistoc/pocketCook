package com.example.pocketCook.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    //@Size(min = 6, max = 100, message = "Password must be between 6 and 100 characters long")
    private String password;

    @Column(name = "e_mail", nullable = false)
    private String email;

    @Column(name = "role")
    private Integer role;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Recipe> recipes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<RecipeComment> recipeComments;

    public User() { }

    public User(Long userId, String name, String surname, String username, String password, String email,
                Integer role, Set<Recipe> recipes, Set<RecipeComment> recipeComments) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.recipes = recipes;
        this.recipeComments = recipeComments;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Set<RecipeComment> getRecipeComments() {
        return recipeComments;
    }

    public void setRecipeComments(Set<RecipeComment> recipeComments) {
        this.recipeComments = recipeComments;
    }
}
