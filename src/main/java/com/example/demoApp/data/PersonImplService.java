package com.example.demoApp.data;

import com.example.demoApp.model.Person;
import com.example.demoApp.model.PersonMpper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class PersonImplService implements PersonService{

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Person> findAll() {
        List<Person> results = jdbcTemplate.query("select * from person", new PersonMpper());
        return results;
    }
}
