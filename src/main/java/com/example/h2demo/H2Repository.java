package com.example.h2demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class H2Repository {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String,Object>> getAll() {
        return jdbcTemplate.queryForList("select * from characters");
    }
}
