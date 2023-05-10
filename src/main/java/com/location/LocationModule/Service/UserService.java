package com.location.LocationModule.Service;


import com.location.LocationModule.Repository.LocationRepository;
import com.location.LocationModule.Repository.UserRepository;
import com.location.LocationModule.Translator.ObjectTranslator;
import com.location.LocationModule.entity.Location;
import com.location.LocationModule.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    ObjectTranslator objectTranslator;

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUser()
    {
        List<User> user = new ArrayList<User>(userRepository.findAll());
        return user;
    }
    public void removeUser(int id)
    {
        userRepository.deleteById(id);
    }
    public void saveOrUpdate(User user)
    {
        userRepository.save(user);

    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void addUsers(List<User> userList) {
        userRepository.saveAll(userList);
    }
}

