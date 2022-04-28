package net.ahzz.share.jpa.entities;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "test_jpa_classes")
@Data
@ApiModel("班级")
public class Classes{

    public Classes(){}
    public Classes(Long id){
        this.id = id;
    }

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String name;
	
    public String code;

    @ApiModelProperty("关联年级id")
    public Long gradeId;
    @ApiModelProperty("关联年级名称")
    public String gradeName;



}
