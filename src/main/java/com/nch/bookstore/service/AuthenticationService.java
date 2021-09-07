package com.nch.bookstore.service;

import com.nch.bookstore.entity.User;
import com.nch.bookstore.security.UserPrincipal;
import com.nch.bookstore.security.jwt.JwtProvider;
import com.nch.bookstore.service.implementation.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements IAuthenticationService
{
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public User signInAndReturnJwt(User signInRequest)
    {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInRequest.getUsername(),signInRequest.getPassword())
        );
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        String jwt = jwtProvider.generationToken(userPrincipal);

        User signInUser = userPrincipal.getUser();
        signInUser.setToken(jwt);
        return signInUser;
    }
}
