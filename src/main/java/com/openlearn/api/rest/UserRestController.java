package com.openlearn.api.rest;

import com.openlearn.api.dao.dto.User;

import java.util.Optional;

public interface UserRestController {

    Optional<User> getUser(Long id);

    User saveUser(User user);

    Object login(String username, String password);
}
