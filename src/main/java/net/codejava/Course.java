package net.codejava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
	@Id
	@Column(nullable=false, unique=true,length=10)
	private Long courseid;

	@Column(nullable=false, unique=true, length=255)
	private String coursename;
	
	@Column(nullable=false, unique=true, length=10)
	private int deptid;
	
	@Column(nullable=false, unique=true, length=255)
	private String coursediff;
	
	public Long getCourseid() {
		return courseid;
	}

	public void setCourseid(Long courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getCoursediff() {
		return coursediff;
	}

	public void setCoursediff(String coursediff) {
		this.coursediff = coursediff;
	}

}
