package com.nacre.resume_builder.dao;

import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public interface ForgotPwdDAO {
public String getPassword(String username)throws ResumeBuilderDBExceptions;
}
