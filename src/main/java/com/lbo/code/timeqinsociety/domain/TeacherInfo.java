package com.lbo.code.timeqinsociety.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * 教师信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "teacher_info")
public class TeacherInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long roleId;

    private Date signTime;

    private Double salaryRatio;

    private Date lastModifyTime;

    private String lastModifier;

    @Transient
    private UserInfo userInfo;
}
