package com.nacre.resume_builder.dao;

import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public interface ChangePwdDAO {
public int changePwd(String newPwd,String username)throws ResumeBuilderDBExceptions;
}
