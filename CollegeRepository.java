package com.PlacementManagementSystemUsingSpring.SprinbootPMS.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PlacementManagementSystemUsingSpring.SpringbootPMS.Model.College;

@Repository
@SpringBeans
public interface CollegeRepository extends JpaRepository<College, Long>{
     
	public College findByCollegeRegdIdAndNameofCollege(int CollegeRegdid, String NameofCollege );

	public Optional<College> findByCity(Long collegeRegdId);
}



