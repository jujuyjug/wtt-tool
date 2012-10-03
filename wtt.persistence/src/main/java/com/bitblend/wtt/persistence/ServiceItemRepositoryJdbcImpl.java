package com.bitblend.wtt.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author zklibur
 */
@Repository
public class ServiceItemRepositoryJdbcImpl
        // Option1: inject "dataSource"
        //        extends JdbcDaoSupport
        implements ServiceItemRepositoryCustom {

// Option2: usando dao-jdbc-context-xml, y es necesario extender de JdbcDaoSupport
//    private JdbcTemplate template;
//
//    public void setTemplate(JdbcTemplate template) {
//        this.template = template;
//    }


// Example
//    private static final String COMPLICATED_SQL = "SELECT * FROM User";
//    public List<User> myCustomBatchOperation() {
//        return getJdbcTemplate().query(COMPLICATED_SQL, new UserRowMapper());
//        return template.query(COMPLICATED_SQL, new UserRowMapper());
//    }
//
//    private static class UserRowMapper implements ParameterizedRowMapper<User> {
//        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//            User user = new User(rs.getLong("id"));
//            user.setUsername(rs.getString("username"));
//            user.setLastname(rs.getString("lastname"));
//            user.setFirstname(rs.getString("firstname"));
//
//            return user;
//        }
//    }

}
