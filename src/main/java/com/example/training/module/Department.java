package com.example.training.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department extends ModelWithIdUpdatedCreatedDeleted {

	@Column
	private String name;
	@Column
	private String code;
	@Column
	private String phonenumber;
	@Column
	private Integer numberofseats;
	@Column
	private Long collegeid;
	@Column
	private Long hodid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Integer getNumberofseats() {
		return numberofseats;
	}

	public void setNumberofseats(Integer numberofseats) {
		this.numberofseats = numberofseats;
	}

	public Long getCollegeid() {
		return collegeid;
	}

	public void setCollegeid(Long collegeid) {
		this.collegeid = collegeid;
	}

	public Long getHodid() {
		return hodid;
	}

	public void setHodid(Long hodid) {
		this.hodid = hodid;
	}

}
