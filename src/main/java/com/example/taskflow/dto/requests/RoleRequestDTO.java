package com.example.taskflow.dto.requests;

import com.example.taskflow.domain.Authority;
import com.example.taskflow.domain.Role;

import java.util.List;

public record RoleRequestDTO(
         String name,
         List<Authority> authorities,
         boolean isDefault
){
    public Role toRole(){
        return Role.builder()
                .name(name)
                .isDefault(isDefault)
                .authorities(authorities)
                .build();
    }
}
