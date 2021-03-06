package com.api.rest.domain.service;


import com.api.rest.domain.User;
import com.api.rest.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll (){return userRepository.getAll();}
    public Optional<List<User>> getByUser (String userId){
        return userRepository.getByUserId(userId);
    }

    public User save (User user){return userRepository.save(user);}

}
