package com.lbo.code.timeqinsociety.web.dto.req;

import com.lbo.code.timeqinsociety.domain.enums.OrderStatus;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaveSubjectOrderReqDto {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "教师id")
    private Long teacherId;

    @ApiModelProperty(value = "学生id")
    private Long studentId;

    @ApiModelProperty(value = "课程id")
    private Long subjectId;

    @ApiModelProperty(value = "课程课时")
    private Integer subjectCount;

    @ApiModelProperty(value = "课程课时费")
    private Double subjectFee;

    @ApiModelProperty(value = "付款时间")
    private Date payTime;

    @ApiModelProperty(value = "付费")
    private Double payFee;

    @ApiModelProperty(value = "状态")
    private OrderStatus status;

    @ApiModelProperty(value = "备注")
    private String remark;
}
