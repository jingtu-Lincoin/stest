package net.ahzz.share.jpa.entities;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "test_jpa_grade")
@Data
@ApiModel("年级")
public class Grade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	public String name;

    public String code;



}
