import com.atguigu.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cc
 * @date 2022年09月20日 22:38
 */
public class FactoryTest {
    @Test
    public void te(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-factory.xml");
        User bean = ioc.getBean(User.class);
        System.out.println(bean);

    }
}
