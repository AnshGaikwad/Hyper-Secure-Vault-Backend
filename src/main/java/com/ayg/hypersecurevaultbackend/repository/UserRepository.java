package com.ayg.hypersecurevaultbackend.repository;

import com.ayg.hypersecurevaultbackend.domain.User;
import com.ayg.hypersecurevaultbackend.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);

}

