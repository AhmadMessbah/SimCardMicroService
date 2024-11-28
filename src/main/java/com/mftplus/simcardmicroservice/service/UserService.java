package com.mftplus.simcardmicroservice.service;

import com.mftplus.simcardmicroservice.model.Role;
import com.mftplus.simcardmicroservice.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void update(User user);
    void delete(String username);
    User findByUsername(String username);
    boolean existsByUsername(String username);
    List<User> findAll();
    List<User> findByRole(Role role);
    List<User> findByRoleName(Role.RoleName roleName);
    User findByUsernameAndPassword(String username, String password);
}