package com.openlearn.api.rest;

import com.openlearn.api.dao.dto.User;
import com.openlearn.api.dao.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserControllerImpl implements UserRestController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @Override
    public Optional<User> getUser(Long id) {
        return this.userService.getUser(id);
    }

    public User saveUser(User user) {
        User userDb = this.userService.saveUser(user);
        logger.info(String.format("Saved user %s: ", userDb));
        return userDb;
    }

    @Override
    public Object login(String username, String password) {
        return null;
    }
}
