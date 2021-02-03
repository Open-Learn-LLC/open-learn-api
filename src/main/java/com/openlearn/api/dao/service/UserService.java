package com.openlearn.api.dao.service;

import com.openlearn.api.dao.dto.User;
import com.openlearn.api.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Service responsible for anything related to users.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(Long id) {
        return this.userRepository.findById(id);
    }

    public User saveUser(User userToSave) {
        addAuditTrail(userToSave);
        return this.userRepository.save(userToSave);
    }

    private void addAuditTrail(User user) {
        user.setCreatedOn(LocalDateTime.now());
    }
}
