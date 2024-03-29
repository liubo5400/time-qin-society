package com.lbo.code.timeqinsociety.domain;

import com.lbo.code.timeqinsociety.domain.enums.OrderStatus;
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
 * 课程订单
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "subject_order")
public class SubjectOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @ApiModelProperty(value = "课程课时")
    private Integer subjectCount;

    @ApiModelProperty(value = "课程课时费")
    private Double subjectFee;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private String creator;

    @ApiModelProperty(value = "付款时间")
    private Date payTime;

    @ApiModelProperty(value = "付费")
    private Double payFee;

    @ApiModelProperty(value = "状态")
    private OrderStatus status;

    @ApiModelProperty(value = "备注")
    private String remark;
}
