package com.lbo.code.timeqinsociety.config;

import cn.dev33.satoken.interceptor.SaAnnotationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        // 注册Sa-Token的路由拦截器
//        registry.addInterceptor(new SaAnnotationInterceptor())
//                .addPathPatterns("/api/**")
//                .excludePathPatterns("/api/admin/login")
//                .excludePathPatterns("/api/admin/draw/**");
    }
}
