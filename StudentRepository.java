package com.PlacementManagementSystemUsingSpring.SprinbootPMS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PlacementManagementSystemUsingSpring.SpringbootPMS.Model.Student;
import com.PlacementManagementSystemUsingSpring.SpringbootPMS.Services.StudentService;

@Repository
@SpringBeans

public interface StudentRepository {
	
	public interface UserRepository extends JpaRepository<Student,Long> {	
		
		public Student findByStudentRegdIdAndNameofCollege(int StudentRegdId, String NameofCollege);

}

	public List<StudentService> findAll();

	public void save(Student student);

	public static void delete(int studentRegdId) {
		// TODO Auto-generated method stub
		
	}

	public Student findOne(int studentRegdId);

	public Student findByStudentRegdIdAndStream(int studentRegdId, String stream);

	
	}

