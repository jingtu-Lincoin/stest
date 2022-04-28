package net.ahzz.share.jpa.dao;

import net.ahzz.share.jpa.entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeDao extends JpaRepository<Grade,Long> {
}
