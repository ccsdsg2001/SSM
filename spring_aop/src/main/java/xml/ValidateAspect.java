package xml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author cc
 * @date 2022年09月22日 22:04
 */

@Component
public class ValidateAspect {

//    @Before("execution(* com.atfuifu.spring.aop.annotation.CalculatorImpl)")
    @Before("xml.LoggerAspect.poiotCut()")
    public void beforemethod(){
        System.out.println("七七奶奶去i那请你你期望你的期望带你去玩你");

    }

}
