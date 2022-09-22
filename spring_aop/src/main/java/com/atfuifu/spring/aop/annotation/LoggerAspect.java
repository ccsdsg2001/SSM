package com.atfuifu.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;

/**
 * @author cc
 * @date 2022年09月22日 20:20
 */
//在切面中，需要通过指定的注解将方法标记为通知方法 @before 前置通知，在目标对象方法执行之前执行
//    切入点表达式：设置在标识通知的注解value属性中  @Before("execution(* com.atfuifu.spring.aop.annotation.*.*(..))") 第一个*标识任意的访问修饰符和返回值类型 第二个*标识类中的任意方法 ..表示任意的参数列表
//    获取连接点的信息 在通知方法的参数位置：设置joinpoing类型的参数，就可以获取连接点所对应方法的信息
    //切入表达式的重用 @Pointcut("execution(* com.atfuifu.spring.aop.*(..))")
    //切面的优先级 通过@order注解value属性设置优先级,默认值integer的最大值 value值越小 优先级越高
@Component
@Aspect //将当前组件标识为切面
public class LoggerAspect {
    @Pointcut("execution(* com.atfuifu.spring.aop.annotation.CalculatorImpl.*(..))")
    public void poiotCut(){}

//    @Before("execution(public int com.atfuifu.spring.aop.annotation.CalculatorImpl.add(int , int))")
//    @Before("execution(* com.atfuifu.spring.aop.annotation.*.*(..))")
    @Before("poiotCut()")
    public void beforeAdviceMethod(JoinPoint joinPoint){
//        获取连接点所对应方法的前面信息
        Signature signature = joinPoint.getSignature();
        System.out.println("前置通知,方法名"+signature);
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args)+signature.getName()+signature.getModifiers());
    }

    @After("poiotCut()")
    //@Afeter 在目标对象finally子句中输出的
    public void after(JoinPoint joinPoint){
        System.out.println("later"+joinPoint.getSignature().getName());
    }

//返回通知 在目标对象返回值之后执行,
    //@AfterRuturning注解的returning属性 就可以将通知方法中的某个参数指定为接受目标对象方法的返回值的参数
    @AfterReturning(value = "poiotCut()",returning = "result")
    public void afterreturn(JoinPoint joinPoint,Object result){
        System.out.println("返回通知"+joinPoint.getSignature().getName());
        System.out.println();
        System.out.println(result);
    }

    //异常通知,在目标对象方法的catch字句中执行 获取异常 只要通过afterthrowing中的throwing属性,就可以将通知方法中的某个参数指定为目标对象方法出现的异常参数
    @AfterThrowing(value = "poiotCut()",throwing = "ex")
    public void afterthrowing(JoinPoint joinPoint,Exception ex){
        System.out.println("方法"+joinPoint.getSignature().getName()+",异常通知");
        System.out.println();
        System.out.println(ex);
    }

//    环绕通知 传入ProceedingJoinPoint
    @Around("poiotCut()")
    public Object arountnotification(ProceedingJoinPoint proceedingJoinPoint){
        //表示目标对象的方法执行
        Object proceed = null;
        try {
            System.out.println("环绕通知-->前置通知");
          proceed = proceedingJoinPoint.proceed();
            System.out.println("环绕通知-->返回通知");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知-->异常");
        }finally {
            System.out.println("环绕-->后置");
        }
        return proceed;

    }

    
}
