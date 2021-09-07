package com.nch.bookstore.service.implementation;

import com.nch.bookstore.entity.User;
import org.springframework.stereotype.Component;


public interface IAuthenticationService {
    User signInAndReturnJwt(User signInRequest);
}
