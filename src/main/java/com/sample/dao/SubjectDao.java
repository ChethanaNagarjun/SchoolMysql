package com.sample.dao;

import java.util.List;
import com.sample.model.Subject;

public interface SubjectDao {

	public Integer save(Subject subject) throws Throwable;

	public Subject getById(Integer Id) throws Throwable;

	public Subject getByName(String name) throws Throwable;

	public void delete(Subject subject) throws Throwable;

	public void update(Subject subject) throws Throwable;

	public List<Subject> getAll() throws Throwable;

}
