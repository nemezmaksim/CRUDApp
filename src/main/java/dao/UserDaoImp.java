package dao;

import entity.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


public class UserDaoImp implements UserDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void createUser(User user) {
        String sql = "INSERT INTO user (name,email,age) VALUES (?,?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getAge());
    }

    @Override
    public User getById(int id) {
        String sql = "SELECT * FROM user WHERE id=?";
        return jdbcTemplate.queryForObject(sql,new UserMapper(),id);
    }

    @Override
    public void updateUser(User user) {
        String sql = "UPDATE user SET name=?, email=?, age=? WHERE id=?";
        jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getAge(), user.getId());
    }

    @Override
    public void deleteUser(int id) {
        String sql = "DELETE FROM user WHERE id=?";
        jdbcTemplate.update(sql,id);
    }
}
