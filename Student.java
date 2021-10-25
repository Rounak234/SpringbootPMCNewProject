package com.PlacementManagementSystemUsingSpring.SpringbootPMS.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Component

@Entity
@Table(name = "Student")

@DynamicInsert
@DynamicUpdate


public class Student{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int StudentRegdId;
	private String NameofCollege;
	private String Stream;
	private Float PercentageofMarks;
	private int PassoutYear;
	public int getStudentRegdId() {
		return StudentRegdId;
	}
	public void setStudentRegdId(int studentRegdId) {
		StudentRegdId = studentRegdId;
	}
	public String getNameofCollege() {
		return NameofCollege;
	}
	public void setNameofCollege(String nameofCollege) {
		NameofCollege = nameofCollege;
	}
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	public Float getPercentageofMarks() {
		return PercentageofMarks;
	}
	public void setPercentageofMarks(Float percentageofMarks) {
		PercentageofMarks = percentageofMarks;
	}
	public int getPassoutYear() {
		return PassoutYear;
	}
	public void setPassoutYear(int passoutYear) {
		PassoutYear = passoutYear;
	}
	
	@Override
	public String toString() {
		return "Student [StudentRegdId=" + StudentRegdId + ", NameofCollege=" + NameofCollege + ", Stream=" + Stream
				+ ", PercentageofMarks=" + PercentageofMarks + ", PassoutYear=" + PassoutYear + "]";

}
	
	
}
