package com.PlacementManagementSystemUsingSpring.SprinbootPMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PlacementManagementSystemUsingSpring.SpringbootPMS.Model.College;

public @interface SpringBeans {
	
	public interface CollegeRepository extends JpaRepository<College, Long>{
	     
		public College findByCollegeRegdIdAndNameofCollege(int CollegeRegdid, String NameofCollege );
	}


}
