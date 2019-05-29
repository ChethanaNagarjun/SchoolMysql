package com.sample.dao;

import java.util.List;
import com.sample.model.UserAuthority;

public interface UserAuthorityDao {

public Integer save(UserAuthority userAuthority)throws Throwable;
	
	public UserAuthority getById(Integer id)throws Throwable;

	public void delete(UserAuthorityDao userAuthority)throws Throwable;

	public void update(UserAuthorityDao userAuthority)throws Throwable;

	public List<UserAuthority> getAll()throws Throwable;

}
