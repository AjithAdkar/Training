package com.example.training.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject extends ModelWithIdUpdatedCreatedDeleted {

	@Column
	private String code;
	@Column
	private String name;
	@Column
	private String author;
	@Column
	private Long instructorid;
	@Column
	private Long semid;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getInstructorid() {
		return instructorid;
	}

	public void setInstructorid(Long instructorid) {
		this.instructorid = instructorid;
	}

	public Long getSemid() {
		return semid;
	}

	public void setSemid(Long semid) {
		this.semid = semid;
	}

}
