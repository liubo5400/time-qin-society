package com.lbo.code.timeqinsociety.domain;

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
@Table(name = "student_info")
public class StudentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String level;

    private Date lastModifyTime;

    private String lastModifier;

    private String remark;

    @Transient
    private UserInfo userInfo;
}
