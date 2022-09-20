package org.susamlu.springweb.dao.repository;

import org.springframework.stereotype.Repository;
import org.susamlu.springweb.dao.entity.User;

/**
 * @author Sam Lu
 * @date 2022/08/30
 */
@Repository
public class UserRepository {

    public User findById(Long userId) {
        return new User(userId, "小穆");
    }

}
