package net.ahzz.share.jpa.service;

import net.ahzz.share.jpa.dao.StudentDao;
import net.ahzz.share.jpa.entities.Student;
import net.ahzz.share.sharejpa.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends BaseService<Student,Long> {

	private StudentDao dao;
	@Autowired
	public StudentService(StudentDao dao){
		super(dao);
		this.dao = dao;
	}

}
