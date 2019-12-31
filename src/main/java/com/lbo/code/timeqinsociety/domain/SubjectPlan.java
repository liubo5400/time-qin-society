package com.lbo.code.timeqinsociety.domain;

import com.lbo.code.timeqinsociety.domain.enums.SubjectStatus;
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

    private Long orderId;

    private Long teacherId;

    private Long studentId;

    private Date startTime;

    private SubjectStatus status;

    private Date lastModifyTime;

    private String lastModifier;

    private String remark;

}
