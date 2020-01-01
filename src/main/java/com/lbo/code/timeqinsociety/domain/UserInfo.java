package com.lbo.code.timeqinsociety.domain;

import com.lbo.code.timeqinsociety.domain.enums.UserStatus;
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
 * 用户
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private Long userId;

    private String username;

    private String password;

    private String name;

    private String headUrl;

    private String mobile;

    private String email;

    private String weixin;

    private String openId;

    private String wxName;

    private String wxHeadUrl;

    private UserStatus status;

    private Date createTime;

    private String creator;

    private Date lastLoginTime;

}
