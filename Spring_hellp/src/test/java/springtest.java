import com.atguigu.spring.pojo.Clazz;
import com.atguigu.spring.pojo.Student;
import com.atguigu.spring.pojo.helloweord;
import com.atguigu.spring.pojo.person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cc
 * @date 2022年09月19日 21:25
 */
public class springtest {
    @Test
    public void test(){
        //获取IOC 容器
        ApplicationContext ioc =new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取容器的bena对象
        helloweord helloweord = (com.atguigu.spring.pojo.helloweord) ioc.getBean("helloweord");
        helloweord.sayhellp();
    }

    @Test
    public void test12(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentone = (Student) applicationContext.getBean("studentone");
        System.out.println(studentone);
        //获取bean的三种方式：1.根据id来获取 2.根据类型来获取 3.根据bean的id 和类型获取
        // 根据类型来获取时，要求ioc容器有且只有一个bean
//        Student bean = applicationContext.getBean(Student.class);
//        Student studenttwo = applicationContext.getBean("studenttwo", Student.class);
        person bean = applicationContext.getBean(person.class);
//        System.out.println(studenttwo);
        System.out.println(bean);
    }

    @Test
    public void test121(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentone = classPathXmlApplicationContext.getBean("studentone", Student.class);
        System.out.println(studentone);
//        Student studentthree = classPathXmlApplicationContext.getBean("studentthree", Student.class);
//        System.out.println(studentthree);
        Student studentthree = classPathXmlApplicationContext.getBean("studentfour", Student.class);
        System.out.println(studentthree);
        System.out.println("------");
        Student studentt1hree = classPathXmlApplicationContext.getBean("student1", Student.class);
        System.out.println(studentt1hree);
        System.out.println();
        Clazz clazzone = classPathXmlApplicationContext.getBean("clazzone", Clazz.class);
        System.out.println(clazzone);

        Student clazzone1 = classPathXmlApplicationContext.getBean("studawqe123",Student.class);
        System.out.println(clazzone1);


    }
}
