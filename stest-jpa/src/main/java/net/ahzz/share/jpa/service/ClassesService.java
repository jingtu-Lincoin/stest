package net.ahzz.share.jpa.service;

import net.ahzz.share.jpa.dao.ClassesDao;
import net.ahzz.share.jpa.entities.Classes;
import net.ahzz.share.sharejpa.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassesService extends BaseService<Classes,Long> {

	private ClassesDao dao;
	@Autowired
	public ClassesService(ClassesDao dao){
		super(dao);
		this.dao = dao;
	}

}
