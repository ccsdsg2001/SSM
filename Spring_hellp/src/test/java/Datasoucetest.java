import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author cc
 * @date 2022年09月20日 20:43
 */
public class Datasoucetest {
    @Test
    public void tes1() throws SQLException {
        ApplicationContext ioc =new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource bean = ioc.getBean(DruidDataSource.class);
        System.out.println(bean.getConnection());
    }
}
