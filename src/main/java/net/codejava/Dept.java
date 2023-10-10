package net.codejava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Dept {
	
	@Id
	@Column(nullable=false, unique=true,length=10)
	private Long deptid;
	
	@Column(nullable=false, unique=true, length=255)
	private String deptname;
	
	@Column(nullable=false, unique=true, length=10)
	private int gradyrs;

	public Long getDeptid() {
		return deptid;
	}

	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getGradyrs() {
		return gradyrs;
	}

	public void setGradyrs(int gradyrs) {
		this.gradyrs = gradyrs;
	}
	
	
}

