package com.lbo.code.timeqinsociety.domain;

import com.lbo.code.timeqinsociety.domain.enums.FeeKind;
import com.lbo.code.timeqinsociety.domain.enums.FeeType;
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
 * 财务信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "finance_info")
public class FinanceInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "费用类型")
    private FeeType feeType;

    @ApiModelProperty(value = "费用类别")
    private FeeKind feeKind;

    @ApiModelProperty(value = "详情")
    private String detail;

    @ApiModelProperty(value = "金额")
    private Double amount;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "支付时间")
    private Date postTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private String creator;

    @ApiModelProperty(value = "备注")
    private String remark;

}
