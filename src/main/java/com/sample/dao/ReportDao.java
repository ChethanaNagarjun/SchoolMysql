package com.sample.dao;

import java.util.List;
import com.sample.model.Report;

public interface ReportDao {

	public Integer save(Report report) throws Throwable;

	public Report getById(Integer id) throws Throwable;

	public Report getByStudentId(Integer studentId) throws Throwable;

	public Report getByReportStatus(String reportStatus) throws Throwable;

	public void delete(Report report) throws Throwable;

	public void update(Report report) throws Throwable;

	public List<Report> getAll() throws Throwable;

}
