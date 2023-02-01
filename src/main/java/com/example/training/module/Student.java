package com.example.training.module;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student extends ModelWithIdUpdatedCreatedDeleted {

	@Column
	private String name;
	@Column
	private String phonenumber;
	@Column
	private String adress;
	@Column
	private String emailid;
	@Column
	private Long departmentid;
	@Column
	private Date admissiondate;
	@Column
	private Integer sem;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Long getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}

	public Date getAdmissiondate() {
		return admissiondate;
	}

	public void setAdmissiondate(Date admissiondate) {
		this.admissiondate = admissiondate;
	}

	public Integer getSem() {
		return sem;
	}

	public void setSem(Integer sem) {
		this.sem = sem;
	}

}
