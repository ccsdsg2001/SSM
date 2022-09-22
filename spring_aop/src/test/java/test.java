import com.atfuifu.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cc
 * @date 2022年09月22日 20:32
 */
public class test {
    @Test
    public void test1(){
        ApplicationContext ioc =new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator bean = ioc.getBean(Calculator.class);
         bean.div(12, 3);
//         bean.div(10, 0);

    }
}
