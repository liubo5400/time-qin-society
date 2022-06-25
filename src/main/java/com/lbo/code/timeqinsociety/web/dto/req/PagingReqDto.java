package com.lbo.code.timeqinsociety.web.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.PortableInterceptor.INACTIVE;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagingReqDto {

    @ApiModelProperty(value = "分页起始条数")
    private Integer start;

    @ApiModelProperty(value = "分页条数")
    private Integer length;
}
