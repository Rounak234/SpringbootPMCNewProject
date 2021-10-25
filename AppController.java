package com.PlacementManagementSystemUsingSpring.SpringbootPMS.Controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PlacementManagementSystemUsingSpring.SprinbootPMS.Repository.CollegeRepository;
import com.PlacementManagementSystemUsingSpring.SpringbootPMS.Exception.ResourceNotFoundException;
import com.PlacementManagementSystemUsingSpring.SpringbootPMS.Model.College;


//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class AppController {
	@Autowired
	private CollegeRepository collegeRepository;

	@GetMapping("/NameofCollege")
	public List<College> getAllCollege() {
		return collegeRepository.findAll();
	}

	@GetMapping("/CollegeRegdId/{id}")
	public ResponseEntity<College> getCollegeById(@PathVariable(value = "id") Long collegeRegdId)
			throws ResourceNotFoundException {
		College college = collegeRepository.findById(collegeRegdId)
				.orElseThrow(() -> new ResourceNotFoundException("College not found for this id :: " + collegeRegdId));
		return ResponseEntity.ok().body(college);
	}

	@PostMapping("/StateofCollege")
	public College createCollege(@Validated @RequestBody College college) {
		return collegeRepository.save(college);
	}

	@PutMapping("/StateofCollege/{id}")
	public ResponseEntity<College> update(@PathVariable(value = "id") int collegeRegdId,
			@Validated @RequestBody College collegeDetails) throws ResourceNotFoundException {
		String collegeId1;
		College college = collegeRepository.findById((long) collegeRegdId)
				.orElseThrow(() -> new ResourceNotFoundException("College not found for this id :: " + collegeRegdId));

	    college.setStateofCollege(collegeDetails.getStateofCollege());
		college.setCityofCollege(collegeDetails.getCityofCollege());
		college.setFirst_Name(collegeDetails.getFirst_Name());
		college.setLast_Name(collegeDetails.getLast_Name());
		College updatedCollege = null;
		try {
			updatedCollege = collegeRepository.save(college);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok(updatedCollege);
	}
	
	
	@RequestMapping("/CollegeRegdId/{city}")
	
	public String StringCollegeRegdId(HttpServletRequest request) {
		request.setAttribute("PMS", "City_of_College");
		return "indexpage";
	}
	public Map<String, Boolean> requestCollege(@PathVariable(value = "id") Long collegeRegdId)
			throws ResourceNotFoundException {
		Long collegeRegdId1;
		
		
		College college = collegeRepository.findById(collegeRegdId)
				.orElseThrow(() -> new ResourceNotFoundException(" not found for this id :: " + collegeRegdId));

		College college1;
		collegeRepository.delete(college);
		Map<String, Boolean> response = new HashMap<>();
		response.put("requested", Boolean.TRUE);
		return response;
			
		
	}
	
	@RequestMapping("/UniversityofCollege/{id}")
	
	public String StringUniversityofCollege(HttpServletRequest request) {
		request.setAttribute("PMS", "University_of_College");
		return "indexpage";
	}
	public Map<String, Boolean> requestCollege1(@PathVariable(value = "id") Long collegeRegdId)
			throws ResourceNotFoundException {
		Long collegeRegdId1;
		
		
		College college = collegeRepository.findById(collegeRegdId)
				.orElseThrow(() -> new ResourceNotFoundException(" not found for this id :: " + collegeRegdId));

		College college1;
		collegeRepository.delete(college);
		Map<String, Boolean> response = new HashMap<>();
		response.put("requested", Boolean.TRUE);
		return response;
		
	}
	
	
	@RequestMapping("/StateofCollege/{city}")
	
	public String StateofCollege(HttpServletRequest request) {
		request.setAttribute("PMS", "State_of_College");
		return "indexpage";
	}
	public Map<String, Boolean> requestCollege11(@PathVariable(value = "city") Long collegeRegdId)
			throws ResourceNotFoundException {
		Long collegeRegdId1;
		
		
		College college = collegeRepository.findByCity(collegeRegdId)
				.orElseThrow(() -> new ResourceNotFoundException(" not found for this city :: " + collegeRegdId));

		College college1;
		collegeRepository.delete(college);
		Map<String, Boolean> response = new HashMap<>();
		response.put("requested", Boolean.TRUE);
		return response;
		
	}
	
	@DeleteMapping("/ZonalDivision/{id}")
	public Map<String, Boolean> deleteCollege(@PathVariable(value = "id") Long collegeRegdId)
			throws ResourceNotFoundException {
		Long collegeId1;
		College college = collegeRepository.findById(collegeRegdId)
				.orElseThrow(() -> new ResourceNotFoundException(" not found for this id :: " + collegeRegdId));

		College college1;
		collegeRepository.delete(college);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}


