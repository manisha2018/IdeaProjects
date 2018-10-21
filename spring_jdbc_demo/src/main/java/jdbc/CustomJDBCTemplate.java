package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomJDBCTemplate {
    private JdbcTemplate jdbcTemplate;

    public CustomJDBCTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void countUser(){
        String sql="SELECT COUNT(*) FROM user";
        System.out.println(jdbcTemplate.queryForObject(sql,Integer.class));
    }
}
