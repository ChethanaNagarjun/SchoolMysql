package com.sample.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "report")

public class Report {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
	private Integer id;
	@Size(max = 10)
	@Column(name = "report_status")
	private String reportStatus;

	@JoinColumn(name = "student_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Student fkeystudentreport;

	public Report() {

	}

	public Report(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student getFkeystudentreport() {
		return fkeystudentreport;
	}

	public void setFkeystudentreport(Student fkeystudentreport) {
		this.fkeystudentreport = fkeystudentreport;
	}

	public String getReportStatus() {
		return reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

}
