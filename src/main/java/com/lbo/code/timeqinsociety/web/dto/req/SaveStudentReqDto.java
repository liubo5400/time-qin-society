package com.lbo.code.timeqinsociety.web.dto.req;

import com.lbo.code.timeqinsociety.domain.enums.Status;
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
public class SaveStudentReqDto {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "学生昵称")
    private String nickname;

    @ApiModelProperty(value = "学生生日")
    private String birthday;

    @ApiModelProperty(value = "学生学校")
    private String school;

    @ApiModelProperty(value = "学生住址")
    private String address;

    @ApiModelProperty(value = "联系人")
    private String liaison;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "学生来源")
    private String source;

    @ApiModelProperty(value = "备注")
    private String remark;
}
