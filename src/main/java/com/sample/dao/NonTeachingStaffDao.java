package com.sample.dao;

import java.util.List;
import com.sample.model.NonTeachingStaff;

public interface NonTeachingStaffDao {
	public Integer save(NonTeachingStaff nonteachingstaff) throws Throwable;

	public NonTeachingStaff getById(Integer id) throws Throwable;

	public NonTeachingStaff getByName(String name) throws Throwable;

	public NonTeachingStaff getByYearOfJoin(Integer yearOfJoin) throws Throwable;

	public NonTeachingStaff getByEmailId(String emailId) throws Throwable;

	public NonTeachingStaff getByPhoneNo(Integer phoneNo) throws Throwable;

	public NonTeachingStaff getBySalary(Integer salary) throws Throwable;

	public NonTeachingStaff getByActivityId(Integer activityId) throws Throwable;

	public void delete(NonTeachingStaff nonTeachingStaff) throws Throwable;

	public void update(NonTeachingStaff nonteachingstaff) throws Throwable;

	public List<NonTeachingStaff> getAll() throws Throwable;

}
