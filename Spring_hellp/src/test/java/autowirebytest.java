import com.atguigu.spring.controller.Usercontroller;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cc
 * @date 2022年09月20日 23:14
 */
public class autowirebytest {
//    自动装配:根据指定的策略,在ioc容器中匹配某个bean,自动为bean中类类型的属性或接口赋值
    //autowire策略:  no,default:表示不装配,即bean中的属性不会匹配某个bean 使用默认值 bytype:根据要赋值的属性的类型,在ioc容器中匹配某个bean,为属性赋值
//    a>若通过类型没有找到任何一个类型匹配的bean ,此时不装配
//    b>若通过类型找到了多个类型的bean 则会抛出异常 NoUniqueBeanOfDefinitionException
//    ioc容器中有且只有一个类型匹配的bean才能为其赋值



    @Test
    public void test(){
        ApplicationContext ioc =new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        Usercontroller bean = ioc.getBean(Usercontroller.class);
        bean.saveuser();
    }
}
