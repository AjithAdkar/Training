package com.example.training.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "student_course")
public class Student_Course extends ModelWithIdUpdatedCreatedDeleted {

	@Column
	private Long course_id;
	@Column
	private Long section_id;
	@Column
	private Long student_id;

	public Long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}

	public Long getSection_id() {
		return section_id;
	}

	public void setSection_id(Long section_id) {
		this.section_id = section_id;
	}

	public Long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}

}
