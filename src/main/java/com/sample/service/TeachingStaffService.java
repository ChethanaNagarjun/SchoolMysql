package com.sample.service;

import java.util.List;
import com.sample.modelmapper.TeachingStaffDetail;

public interface TeachingStaffService {

	public Integer save(TeachingStaffDetail teachingstaffdetail) throws Throwable;

	public void delete(Integer teachingstaffdetail) throws Throwable;

	public void update(Integer teachingstaffdetail,Integer salary) throws Throwable;

	public List<TeachingStaffDetail> getAllTeachingStaffs() throws Throwable;

}
