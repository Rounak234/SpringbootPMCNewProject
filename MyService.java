package com.PlacementManagementSystemUsingSpring.SpringbootPMS.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.PlacementManagementSystemUsingSpring.SpringbootPMS.Model.College;

@Service
@Transactional
public interface MyService {

	Optional<College> getCollegeById1(int collegeRegdid1);

	List<College> getColleges();
	List<College> getColleges1();

	public Optional<College> getCollegeById(int collegeRegdid);
	public College addNewCollege(College college);
	public College updateCollege(College college);
	public void deleteCollegeById(int collegeRegdid);
	public void deleteAllColleges();
    College updateCollege(Object upCollege);



	

	
}
