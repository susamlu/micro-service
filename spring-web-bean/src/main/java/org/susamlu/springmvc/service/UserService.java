package org.susamlu.springweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.susamlu.springweb.dao.entity.User;
import org.susamlu.springweb.dao.repository.UserRepository;

/**
 * @author Sam Lu
 * @date 2022/08/30
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUser(Long userId) {
        return userRepository.findById(userId);
    }

}
