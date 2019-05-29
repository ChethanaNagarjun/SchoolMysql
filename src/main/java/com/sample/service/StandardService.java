package com.sample.service;

import java.util.List;
import com.sample.modelmapper.StandardDetail;

public interface StandardService {

	public Integer save(StandardDetail standarddetail) throws Throwable;

	public void delete(Integer standarddetail) throws Throwable;

	public void update(Integer standarddetail,String name ) throws Throwable;

	public List<StandardDetail> getAllStandards() throws Throwable;

}
