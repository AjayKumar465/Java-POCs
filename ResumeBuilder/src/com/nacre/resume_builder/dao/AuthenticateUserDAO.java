package com.nacre.resume_builder.dao;

import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public interface AuthenticateUserDAO {
public int authenticateUser(String username,String password)throws ResumeBuilderDBExceptions;
}
