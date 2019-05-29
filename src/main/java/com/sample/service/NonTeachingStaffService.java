package com.sample.service;

import java.util.List;
import com.sample.modelmapper.NonTeachingStaffDetail;

public interface NonTeachingStaffService {

	public Integer save(NonTeachingStaffDetail nonteachingstaffdetail) throws Throwable;

	public void delete(Integer nonteachingstaff) throws Throwable;

	public void update(Integer nonteachingstaffdetail,String emailId,String name) throws Throwable;

	public List<NonTeachingStaffDetail> getAllNonTeachingStaffs() throws Throwable;

}
