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
@Table(name = "nonteachingstaff")
public class NonTeachingStaff {
	
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
	@Size(max = 20)
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "phone_no")
	private Integer phoneNo;
	@Column(name = "salary")
	private Integer salary;

	@JoinColumn(name = "activity_id", referencedColumnName = "id")
	@OneToOne(optional = false)
	private Activity fkeyActivityId;

	public NonTeachingStaff() {

	}

	public NonTeachingStaff(Integer id) {
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

	public Activity getFkeyActivityId() {
		return fkeyActivityId;
	}

	public void setFkeyActivityId(Activity fkeyActivityId) {
		this.fkeyActivityId = fkeyActivityId;
	}

}
