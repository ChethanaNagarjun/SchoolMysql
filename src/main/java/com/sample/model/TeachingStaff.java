package com.sample.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "teachingstaff")
public class TeachingStaff {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
	private Integer id;
	@Size(max = 20)
	@Column(name = "name")
	private String name;
	@Column(name = "year_of_join")
	private Integer yearOfJoin;
	@Size(max = 10)
	@Column(name = "education_details")
	private String educationDetails;
	@Size(max = 20)
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "phone_no")
	private Integer phoneNo;
	@Column(name = "salary")
	private Integer salary;

	@JoinColumn(name = "standard_id", referencedColumnName = "id")
	@OneToOne(optional = false)
	private Standard fkeyTeacherStandardId;

	@JoinColumn(name = "subject_id", referencedColumnName = "id")
	@OneToOne(optional = false)
	private Subject fkeyTeacherSubjectId;

	public TeachingStaff() {
    }

	public TeachingStaff(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYearOfJoin() {
		return yearOfJoin;
	}

	public void setYearOfJoin(Integer yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}

	public String getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(String educationDetails) {
		this.educationDetails = educationDetails;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Standard getFkeyTeacherStandardId() {
		return fkeyTeacherStandardId;
	}

	public void setFkeyTeacherStandardId(Standard fkeyTeacherStandardId) {
		this.fkeyTeacherStandardId = fkeyTeacherStandardId;
	}

	public Subject getFkeyTeacherSubjectId() {
		return fkeyTeacherSubjectId;
	}

	public void setFkeyTeacherSubjectId(Subject fkeyTeacherSubjectId) {
		this.fkeyTeacherSubjectId = fkeyTeacherSubjectId;
	}
	
	

}
