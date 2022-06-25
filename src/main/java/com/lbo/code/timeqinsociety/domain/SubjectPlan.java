package com.lbo.code.timeqinsociety.domain;

import com.lbo.code.timeqinsociety.domain.enums.SubjectStatus;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 课程安排
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "subject_plan")
public class SubjectPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Long orderId;

    @ApiModelProperty(value = "教师id")
    private Long teacherId;

    @ApiModelProperty(value = "教师名称")
    private String teacherName;

    @ApiModelProperty(value = "学生id")
    private Long studentId;

    @ApiModelProperty(value = "学生姓名")
    private String studentName;

    @ApiModelProperty(value = "课程id")
    private Long subjectId;

    @ApiModelProperty(value = "课程姓名")
    private String subjectName;

    @ApiModelProperty(value = "预约时间")
    private Date orderTime;

    @ApiModelProperty(value = "上课时间")
    private Date startTime;

    @ApiModelProperty(value = "下课时间")
    private Date endTime;

    @ApiModelProperty(value = "状态")
    private SubjectStatus status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private String creator;

    @ApiModelProperty(value = "最后修改时间")
    private Date lastModifyTime;

    @ApiModelProperty(value = "最后修改人")
    private String lastModifier;

    @ApiModelProperty(value = "备注")
    private String remark;

}
