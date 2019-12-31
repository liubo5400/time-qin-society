package com.lbo.code.timeqinsociety.web.dto.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginAdminReqDto {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
