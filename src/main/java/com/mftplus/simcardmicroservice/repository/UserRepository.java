package com.mftplus.simcardmicroservice.repository;

import com.mftplus.simcardmicroservice.model.Role;
import com.mftplus.simcardmicroservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    boolean existsUserByUsername(String username);
    User findByUsername(String username);
    Optional<User> findByUsernameAndPassword(String username, String password);
    List<User> findByRoleSetContaining(Role role);
    List<User> findByRoleSetRoleName(Role.RoleName roleName);
}
