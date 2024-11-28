package com.mftplus.simcardmicroservice.repository;

import com.mftplus.simcardmicroservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
    Role findByRoleName(Role.RoleName name);
}
