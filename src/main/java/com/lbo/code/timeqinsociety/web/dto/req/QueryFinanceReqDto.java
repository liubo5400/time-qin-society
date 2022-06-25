package com.lbo.code.timeqinsociety.web.dto.req;

import com.lbo.code.timeqinsociety.domain.enums.FeeKind;
import com.lbo.code.timeqinsociety.domain.enums.FeeType;
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
public class QueryFinanceReqDto extends PagingReqDto {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "费用类型，收入|支出")
    private FeeType feeType;

    @ApiModelProperty(value = "费用类别")
    private FeeKind feeKind;

    @ApiModelProperty(value = "详情")
    private String detail;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "支付时间")
    private Date postTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private String creator;
}
