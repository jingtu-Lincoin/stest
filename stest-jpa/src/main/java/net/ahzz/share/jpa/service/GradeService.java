package net.ahzz.share.jpa.service;

import net.ahzz.share.jpa.dao.GradeDao;
import net.ahzz.share.jpa.entities.Grade;
import net.ahzz.share.sharejpa.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService extends BaseService<Grade,Long> {

	private GradeDao dao;
	@Autowired
	public GradeService(GradeDao dao){
		super(dao);
		this.dao = dao;
	}

}
