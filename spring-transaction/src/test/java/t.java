import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.controller.Bookcontroller;

/**
 * @author cc
 * @date 2022年09月23日 19:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class t {

    @Autowired
    private Bookcontroller bookcontroller;
    @Test
    public void testbuybook(){
        bookcontroller.buybook(1,1);

    }



}
