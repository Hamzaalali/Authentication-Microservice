package com.example.authenticationmicroservice.services;

import com.example.authenticationmicroservice.entities.Role;
import com.example.authenticationmicroservice.entities.RoleRepo;
import com.example.authenticationmicroservice.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepo roleRepo;

    public Role createRole(Role role){
        return roleRepo.save(role);
    }
    public Role getRole(Long id){
        Optional<Role> role= roleRepo.findById(id);
        return role.orElse(null);
    }
    public List<Role> getAllRoles(){
        return roleRepo.findAll();
    }
}
