package in.spdev.aop.timetracker.dao;
import java.util.ArrayList;

import in.spdev.aop.timetracker.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class AccountDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>>  getAll(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from hb_db.account");
        return maps;
    }
}
