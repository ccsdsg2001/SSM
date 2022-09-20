import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cc
 * @date 2022年09月20日 21:00
 */
public class scopetest {
    @Test
    public void test1(){
        ApplicationContext ioc= new ClassPathXmlApplicationContext("spring-scope.xml");
        Student bean = ioc.getBean(Student.class);
        Student bean3 = ioc.getBean(Student.class);
        System.out.println(bean.equals(bean3));

    }
}
