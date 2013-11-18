package tdd.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import org.springframework.jdbc.core.RowMapper;
import tdd.data.domain.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceContext.class)
public class PersistencePlaygroundTest {

    @Autowired
    DataSource dataSource;

    @Test
    public void shouldFetch() throws Exception {
        JdbcTemplate template = new JdbcTemplate(dataSource);
        //play here
        
        RowMapper<Person> mapper = new RowMapper<Person>() {

            @Override
            public Person mapRow(ResultSet rs, int i) throws SQLException {
                return new Person(rs.getInt("id"), rs.getString("name"));
            }
        };
        List<Person> results = template.query("select * from person", mapper);
        System.out.println(results);
    }
}
