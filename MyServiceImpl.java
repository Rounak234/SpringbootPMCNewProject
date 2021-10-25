package com.PlacementManagementSystemUsingSpring.SpringbootPMS.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementManagementSystemUsingSpring.SprinbootPMS.Repository.CollegeRepository;
import com.PlacementManagementSystemUsingSpring.SpringbootPMS.Model.College;


@Service
public class MyServiceImpl implements MyService {
	
	

	@Autowired
	CollegeRepository College;
	
	
	@Override
	public List<College> getColleges1() {
		// TODO Auto-generated method stub
		return College.findAll();
	}

	

	@Override
	public Optional<College> getCollegeById1(int CollegeRegdid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<College> getColleges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<College> getCollegeById(int CollegeRegdid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public College addNewCollege(College college) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public College updateCollege(College college) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCollegeById(int CollegeRegdid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllColleges() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public College updateCollege(Object upCollege) {
		// TODO Auto-generated method stub
		return null;
	}



	
}