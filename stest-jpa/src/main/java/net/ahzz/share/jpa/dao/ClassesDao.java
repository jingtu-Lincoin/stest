package net.ahzz.share.jpa.dao;

import net.ahzz.share.jpa.entities.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesDao extends JpaRepository<Classes,Long> {
}
