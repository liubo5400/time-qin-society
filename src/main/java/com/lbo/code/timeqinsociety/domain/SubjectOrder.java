package com.lbo.code.timeqinsociety.domain;

import com.lbo.code.timeqinsociety.domain.enums.OrderStatus;
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

    private String orderSn;

    private Long studentId;

    private String subject;

    private Integer totalCount;

    private Integer recommendCount;

    private Long teacherId;

    private String teacherName;

    private Date createTime;

    private String creator;

    private Date payTime;

    private Double payCount;

    private Date postTime;

    private OrderStatus status;

    private Date renewTime;

    private Date lastModifyTime;

    private String lastModifier;

    private String remark;
}
