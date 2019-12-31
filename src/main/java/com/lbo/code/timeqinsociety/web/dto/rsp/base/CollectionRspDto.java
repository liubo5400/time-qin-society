package com.lbo.code.timeqinsociety.web.dto.rsp.base;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollectionRspDto<T> {
    private long total;
    private List<T> data = Lists.newArrayList();

    public CollectionRspDto(long total) {
        this.total = total;
    }
}
