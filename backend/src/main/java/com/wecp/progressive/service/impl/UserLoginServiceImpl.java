package com.wecp.progressive.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.wecp.progressive.dto.UserRegistrationDTO;
import com.wecp.progressive.entity.User;

public class UserLoginServiceImpl implements UserDetailsService{


    public User createUser(User user) {
        return null;
    }

    public User getUserByUsername(String username) {
        return null;
    }

    public void registerUser(UserRegistrationDTO userRegistrationDTO) throws Exception{

    }

    public User getUserDetails(int userId) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       
        return null;
    }
    
}
