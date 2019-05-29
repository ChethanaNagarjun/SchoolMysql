package com.sample.service;

import java.util.List;
import com.sample.modelmapper.SubjectDetail;

public interface SubjectService {

	public Integer save(SubjectDetail subjectdetail) throws Throwable;

	public void delete(Integer subjectdetail) throws Throwable;

	public void update(Integer subjectdetail,String subjectName) throws Throwable;

	public List<SubjectDetail> getAllSubjects() throws Throwable;

}
