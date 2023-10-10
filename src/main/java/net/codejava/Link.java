package net.codejava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="links")
public class Link {
	
	@Id
	@Column(nullable=false, unique=true,length=10)
	private int linkid;
	
	@Column(nullable=false, unique=true, length=255)
	private String links;
	
	@Column(nullable=false, unique=true, length=10)
	private int courseid;
	
	public int getLinkid() {
		return linkid;
	}

	public void setLinkid(int linkid) {
		this.linkid = linkid;
	}

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

}
