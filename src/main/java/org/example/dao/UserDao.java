package org.example.dao;

import org.example.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public UserDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<User> getAll() {
        return this.jdbcTemplate.query(
                "select id, name, email from users",
                (resultSet, rowNum) -> {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setName(resultSet.getString("name"));
                    user.setEmail(resultSet.getString("email"));
                    return user;
                });
    }

    public void delete(int id) {
        this.jdbcTemplate.update(
                "delete from users where id = ?",
                id);
    }
}
