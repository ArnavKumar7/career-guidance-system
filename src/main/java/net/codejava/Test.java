package net.codejava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class Test {

	@Id
	@Column(nullable=false, unique=true, length=255)
	private int questionid;
	
	@Column(nullable=false, unique=false,length=10)
	private int testid;
	
	
	
	@Column(nullable=false, unique=true, length=10)
	private String questionname;
	
	@Column(nullable=false, unique=true, length=10)
	private String opt1;
	
	@Column(nullable=false, unique=true, length=10)
	private String opt2;
	
	@Column(nullable=false, unique=true, length=10)
	private String opt3;
	
	@Column(nullable=false, unique=true, length=10)
	private String opt4;
	
	@Column(nullable=false, unique=true, length=10)
	private String answer;
	
	@Column(nullable=false, unique=false, length=10)
	private int courseid;

	public int getTestid() {
		return testid;
	}

	public void setTestid(int testid) {
		this.testid = testid;
	}

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getQuestionname() {
		return questionname;
	}

	public void setQuestionname(String questionname) {
		this.questionname = questionname;
	}

	public String getOpt1() {
		return opt1;
	}

	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}

	public String getOpt2() {
		return opt2;
	}

	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}

	public String getOpt3() {
		return opt3;
	}

	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}

	public String getOpt4() {
		return opt4;
	}

	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	
	
}
