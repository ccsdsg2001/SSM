import com.atguigu.spring.controller.Usercontroller;
import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cc
 * @date 2022年09月21日 12:46
 */
public class test {
    @Test
    public void test1(){
        ApplicationContext ioc =new ClassPathXmlApplicationContext("spring.xml");
        Usercontroller bean = ioc.getBean(Usercontroller.class);
//        System.out.println(bean);
//        UserService bean1 = ioc.getBean(UserService.class);
//        System.out.println(bean1);
//        UserDao bean2 = ioc.getBean(UserDao.class);
//        System.out.println(bean2);
        bean.saveUser();
    }
}
