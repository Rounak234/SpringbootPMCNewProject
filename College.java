package com.PlacementManagementSystemUsingSpring.SpringbootPMS.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;



@Component

@Entity
@Table(name = "pmscollege")

@DynamicInsert
@DynamicUpdate

public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CollegeRegdId;
	private String NameofCollege;
	private String UniversityofCollege;
	private String First_Name;
	private String Last_Name;
	private String StateofCollege;
	private String CityofCollege;
	private String ZonalDivision;

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public int getCollegeRegdId() {
		return CollegeRegdId;
	}

	public void setCollegeRegdId(int collegeRegdId) {
		this.CollegeRegdId = CollegeRegdId;
	}

	public String getNameofCollege() {
		return NameofCollege;
	}

	public void setNameofCollege(String nameofCollege) {
		this.NameofCollege = nameofCollege;
	}

	public String getUniversityofCollege() {
		return UniversityofCollege;
	}

	public void setUniversityofCollege(String universityofCollege) {
		this.UniversityofCollege = universityofCollege;
	}

	public String getStateofCollege() {
		return StateofCollege;
	}

	public void setStateofCollege(String stateofCollege) {
		this.StateofCollege = stateofCollege;
	}

	public String getCityofCollege() {
		return CityofCollege;
	}

	public void setCityofCollege(String cityofCollege) {
		this.CityofCollege = cityofCollege;
	}

	public String getZonalDivision() {
		return ZonalDivision;
	}

	public void setZonalDivision(String zonalDivision) {
		this.ZonalDivision = zonalDivision;
	}

	@Override
	public String toString() {
		return "College [CollegeRegdId=" + CollegeRegdId + ", NameofCollege=" + NameofCollege + ", UniversityofCollege="
				+ UniversityofCollege + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", StateofCollege="
				+ StateofCollege + ", CityofCollege=" + CityofCollege + ", ZonalDivision=" + ZonalDivision + "]";
	}

	

}
