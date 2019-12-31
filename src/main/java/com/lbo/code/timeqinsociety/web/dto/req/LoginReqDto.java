package com.lbo.code.timeqinsociety.web.dto.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginReqDto {

    private String oId;

    private String username;

    private String password;
}
