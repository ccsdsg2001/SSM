import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.pojo.user;

import java.util.List;

/**
 * @author cc
 * @date 2022年09月23日 18:05
 */
//指定当前测试类在spring环境中执行,注入的方式来获取ioc的bean
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring测试环境的配置文件
@ContextConfiguration("classpath:spring-jdbc.xml")
public class test {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test1(){
        String sql="insert into t_user values(null,?,?,?,?,?)";
        jdbcTemplate.update(sql,"root","123",23,"女","123@qq.cpm");

    }

    @Test
    public void select(){
        String sql = "select * from t_user where id = ?";

        user user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(user.class), 3);

        System.out.println(user);


        String ListSql="select * from t_user";
        List<spring.pojo.user> query = jdbcTemplate.query(ListSql, new BeanPropertyRowMapper<>(user.class));
        query.forEach(System.out::println);

        String countsql = "select count(*) from t_user";
        Integer integer = jdbcTemplate.queryForObject(countsql, Integer.class);
        System.out.println(integer);


    }






}
