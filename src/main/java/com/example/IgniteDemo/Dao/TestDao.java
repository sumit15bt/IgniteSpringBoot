package com.example.IgniteDemo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class TestDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> getUsers() {
        List<Map<String, Object>> data = jdbcTemplate.queryForList("SELECT * from ct_user");
        return data;
    }

}
