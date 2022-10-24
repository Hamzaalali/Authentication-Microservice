package com.example.authenticationmicroservice.services;

import com.example.authenticationmicroservice.entities.*;
import com.example.authenticationmicroservice.excepotions.EmailAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    private final UserTokensRepo userTokensRepo;
    public User createUser(User user) throws EmailAlreadyExistsException {
        User userWithEmail=findUserByEmail(user.getEmail());
        System.out.println(user);
        if(userWithEmail!=null){
            throw new EmailAlreadyExistsException();
        }
        User registeredUser=userRepo.save(user);
        UserTokens userTokens=new UserTokens();
        userTokens.setUser(registeredUser);
        userTokensRepo.save(userTokens);
        return registeredUser;
    }
    public List<User> getUsers(){
        return userRepo.findAll();
    }
    public User findUserById(Long id){
        User user= userRepo.findUserById(id);
        return user;
    }
    public User findUserByEmail(String email){
        User user= userRepo.findUserByEmail(email);
        return user;
    }
}
