package com.sample.dao;

import java.util.List;
import com.sample.model.TeachingStaff;

public interface TeachingStaffDao {
	public Integer save(TeachingStaff teachingstaff) throws Throwable;

	public TeachingStaff getById(Integer id) throws Throwable;

	public TeachingStaff getByName(String name) throws Throwable;

	public TeachingStaff getByYearOfJoin(Integer yearOfJoin) throws Throwable;

	public TeachingStaff getByEducationDetails(String educationDetails) throws Throwable;

	public TeachingStaff getByEmailId(String emailId) throws Throwable;

	public TeachingStaff getByPhoneNo(Integer phoneNo) throws Throwable;

	public TeachingStaff getBySalary(Integer salary) throws Throwable;

	public TeachingStaff getByClassId(Integer classId) throws Throwable;

	public TeachingStaff getBySubjectId(Integer subjectId) throws Throwable;

	public void delete(TeachingStaff teachingstaff) throws Throwable;

	public void update(TeachingStaff teachingstaff) throws Throwable;

	public List<TeachingStaff> getAll() throws Throwable;

}
