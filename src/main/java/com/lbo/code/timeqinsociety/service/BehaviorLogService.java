package com.lbo.code.timeqinsociety.service;

import com.github.pagehelper.Page;
import com.lbo.code.timeqinsociety.domain.BehaviorLog;

import java.util.Map;

public interface BehaviorLogService {

    Long create(BehaviorLog behaviorLog);

    Page<BehaviorLog> queryPage(Map<String, Object> params, int start, int length);

}
