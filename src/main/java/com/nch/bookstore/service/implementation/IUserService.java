package com.nch.bookstore.service.implementation;

import com.nch.bookstore.entity.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
        //TransactionalRequired when executing on update/delete query.
    void makeAdmin(String username);
}
