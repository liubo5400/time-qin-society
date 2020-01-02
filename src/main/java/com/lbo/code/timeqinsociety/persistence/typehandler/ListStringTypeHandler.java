package com.lbo.code.timeqinsociety.persistence.typehandler;

import com.alibaba.fastjson.JSONArray;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.springframework.util.CollectionUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@MappedTypes(List.class)
@MappedJdbcTypes({JdbcType.VARCHAR})
public class ListStringTypeHandler extends BaseTypeHandler<List> {

    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List list, JdbcType jdbcType) throws SQLException {
        if (CollectionUtils.isEmpty(list)) {
            preparedStatement.setString(i, "");
        } else {
            if (list.get(0) instanceof String) {
                //1.List集合转字符串
                StringBuffer sb = new StringBuffer();
                for (Object string : list) {
                    sb.append(string).append(",");
                }
                //2.设置给ps
                preparedStatement.setString(i, sb.toString().substring(0, sb.toString().length() - 1));
            } else {
                //1.List集合转字符串
                String json = JSONArray.toJSONString(list);
                //2.设置给ps
                preparedStatement.setString(i, json);
            }
        }
    }

    @Override
    public List getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String value = resultSet.getString(s);
        if (StringUtils.isBlank(value))
            return Lists.newArrayList();

        String[] split = value.split(",");
        return Arrays.stream(split).collect(Collectors.toList());
    }

    @Override
    public List getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String value = resultSet.getString(i);
        if (StringUtils.isBlank(value))
            return Lists.newArrayList();

        String[] split = value.split(",");
        return Arrays.stream(split).collect(Collectors.toList());
    }

    @Override
    public List getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String value = callableStatement.getString(i);
        if (StringUtils.isBlank(value))
            return Lists.newArrayList();

        String[] split = value.split(",");
        return Arrays.stream(split).collect(Collectors.toList());
    }

}
