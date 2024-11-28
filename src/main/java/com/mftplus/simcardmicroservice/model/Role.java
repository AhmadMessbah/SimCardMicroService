package com.mftplus.simcardmicroservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

@Entity(name = "roleEntity")
@Table(name = "role_tbl")
public class Role {
    @Id
    @Column(name="role_name", length = 30)
    private RoleName roleName;

    public enum RoleName{
        ADMIN, CUSTOMER
    }
}
