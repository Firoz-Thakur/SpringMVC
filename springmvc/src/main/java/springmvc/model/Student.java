package springmvc.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complexformmmm")
public class Student {

	
	private String name;
	@Id
	private int id;
	private Date dob;
	private ArrayList<String>courses;
	private String gender;
	private String studenttype;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public Student(String name, int id, Date dob, List<String> courses, String gender, String studenttype) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.courses = (ArrayList<String>) courses;
		this.gender = gender;
		this.studenttype = studenttype;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = (ArrayList<String>) courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStudenttype() {
		return studenttype;
	}
	public void setStudenttype(String studenttype) {
		this.studenttype = studenttype;
	}
}
