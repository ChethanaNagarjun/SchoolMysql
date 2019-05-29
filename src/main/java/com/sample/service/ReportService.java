package com.sample.service;

import java.util.List;
import com.sample.modelmapper.ReportDetail;

public interface ReportService {

	public Integer save(ReportDetail reportdetail) throws Throwable;

	public void delete(Integer reportdetail) throws Throwable;

	public void update(Integer reportdetail,String reportStatus) throws Throwable;

	public List<ReportDetail> getAllReports() throws Throwable;

}
