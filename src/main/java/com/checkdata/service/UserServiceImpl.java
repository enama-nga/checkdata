package com.checkdata.service;

import com.checkdata.model.User;
import com.checkdata.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;
    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User usr= userRepository.findById(id).get();
        if(Objects.nonNull(user.getName())&&
                !"".equalsIgnoreCase(user.getName())) {
            usr.setName(user.getName());
        }
        if(Objects.nonNull(user.getEmail())&&
                !"".equalsIgnoreCase(user.getEmail())) {
            usr.setEmail(user.getEmail());
        }

        return userRepository.save(usr);
    }

    @Override
    public void deleteUser(Long id) {
       userRepository.deleteById(id);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {
//        logger.info("Inside getAllUsers in UserServiceImpl calss");
               return userRepository.findAll();
    }

}

