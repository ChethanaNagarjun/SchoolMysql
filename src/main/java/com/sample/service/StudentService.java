package com.sample.service;

import java.util.List;
import com.sample.modelmapper.StudentDetail;

public interface StudentService {

	public Integer save(StudentDetail studentdetail) throws Throwable;

	public void delete(Integer studentdetail) throws Throwable;

	public void update(Integer studentdetail,Integer phoneNo) throws Throwable;

	public List<StudentDetail> getAllStudents() throws Throwable;

}
