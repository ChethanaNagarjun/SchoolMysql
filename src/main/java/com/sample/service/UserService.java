package com.sample.service;

import java.util.List;
import com.sample.modelmapper.UserDetail;

public interface UserService {

	public Integer save(UserDetail userDetail) throws Throwable;

	public void delete(Integer userDetail) throws Throwable;

	public void update(Integer userDetail) throws Throwable;

	public List<UserDetail> getAllUsers() throws Throwable;

}
