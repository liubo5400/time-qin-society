package com.lbo.code.timeqinsociety.web.dto.rsp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginAdminRspDto {

    private Long id;

    private String name;

    private String headUrl;

    private String token;

}
