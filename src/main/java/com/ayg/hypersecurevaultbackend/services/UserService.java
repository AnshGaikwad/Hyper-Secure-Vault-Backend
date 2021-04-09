package com.ayg.hypersecurevaultbackend.services;

import com.ayg.hypersecurevaultbackend.domain.User;
import com.ayg.hypersecurevaultbackend.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
