package com.lbo.code.timeqinsociety.persistence.typehandler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(JSONObject.class)
@MappedJdbcTypes({JdbcType.VARCHAR})
public class JsonTypeHandler extends BaseTypeHandler<JSONObject> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, JSONObject jsonObject, JdbcType jdbcType) throws SQLException {
        if (jdbcType == null) {
            preparedStatement.setObject(i, jsonObject.toString());
        } else {
            preparedStatement.setObject(i, jsonObject.toString(), jdbcType.TYPE_CODE);
        }
    }

    @Override
    public JSONObject getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
        return null == resultSet.getString(columnName) && resultSet.wasNull()
                ? null : JSON.parseObject(resultSet.getString(columnName));
    }

    @Override
    public JSONObject getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
        return null == resultSet.getString(columnIndex) && resultSet.wasNull()
                ? null : JSON.parseObject(resultSet.getString(columnIndex));
    }

    @Override
    public JSONObject getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        return null == callableStatement.getString(columnIndex) && callableStatement.wasNull()
                ? null : JSON.parseObject(callableStatement.getString(columnIndex));
    }
}
