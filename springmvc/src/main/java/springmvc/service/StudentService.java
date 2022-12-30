package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.StudentDao;
import springmvc.model.Student;

@Service
public class StudentService {

	
	@Autowired
	private StudentDao studentDao;
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public int createStudent(Student stu)
	{
		
		return this.studentDao.saveStudent(stu);
	}

}
