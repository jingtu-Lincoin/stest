package net.ahzz.share.jpa.entities;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;


@Entity
@Table(name = "test_jpa_student")
@Data
@ApiModel("学生")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String name;
	
    public String code;

    @ApiModelProperty("1男2女0未知")
    public String sex;

    public int age;

    @ApiModelProperty("1未审核，2审核通过，3审核不通过")
    public String status;

    @ApiModelProperty("排序字段")
    public int orderNum;

    @ApiModelProperty("关联班级，不推荐使用这种方式关联")
    @ManyToOne
    @JoinColumn(name = "classes",foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    @NotFound(action = NotFoundAction.IGNORE)
    public Classes classes;



}
