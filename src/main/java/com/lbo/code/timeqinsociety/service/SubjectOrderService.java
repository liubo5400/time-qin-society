package com.lbo.code.timeqinsociety.service;

import com.github.pagehelper.Page;
import com.lbo.code.timeqinsociety.domain.Subject;

import java.util.Map;

public interface SubjectOrderService {

    Page<Subject> queryPage(Map<String, Object> params, int start, int length);

    Subject get(Long id);

    Long create(Subject subject);

    void update(Subject subject);

    void delete(Long id);
}
