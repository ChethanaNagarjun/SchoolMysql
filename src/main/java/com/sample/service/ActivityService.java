package com.sample.service;

import java.util.List;
import com.sample.modelmapper.ActivityDetail;

public interface ActivityService {

	public Integer save(ActivityDetail activityDetail) throws Throwable;

	public void delete(Integer activityDetail) throws Throwable;

	public void update(Integer activityDetail, String activityName) throws Throwable;

	public List<ActivityDetail> getAllActivites() throws Throwable;

}
