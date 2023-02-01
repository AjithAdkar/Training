package com.example.training.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course extends ModelWithIdUpdatedCreatedDeleted {
	@Column
	private String courseduration;
	@Column
	private String name;
	@Column
	private Long departmentid;
	@Column
	private Long instructorid;

	public String getCourseduration() {
		return courseduration;
	}

	public void setCourseduration(String courseduration) {
		this.courseduration = courseduration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}

	public Long getInstructorid() {
		return instructorid;
	}

	public void setInstructorid(Long instructorid) {
		this.instructorid = instructorid;
	}

}
