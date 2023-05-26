package com.example.demoApp.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMpper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person(
                rs.getLong("id"),
                rs.getString("first_name"),
                rs.getInt("age")
        );
        return person;
    }
}
