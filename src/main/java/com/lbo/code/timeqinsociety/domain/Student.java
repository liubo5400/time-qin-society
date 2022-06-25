package com.lbo.code.timeqinsociety.domain;

import com.lbo.code.timeqinsociety.domain.enums.Status;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * 学员信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ApiModelProperty(value = "状态")
    private Status status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "学生来源")
    private String source;

    @ApiModelProperty(value = "备注")
    private String remark;

}
