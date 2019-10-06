package spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@Configuration
@EnableAspectJAutoProxy
//@Component
public class Aop {
    @Pointcut("execution(* spring.MyComponent.*(..))")
    public void pointcut() {
    }

    @Before("Aop.pointcut()")
    public void post(JoinPoint joinPoint) {
        System.out.println("Before=" + joinPoint.getSignature());
    }
//
//    @AfterReturning(value="execution(* spring.MyComponent.*(..))" ,returning = "rsult")
//    public void after(JoinPoint joinPoint,Object rsult) {
//        System.out.println("AfterReturning = " + rsult);
//    }
//
//    @After(value="execution(* spring.MyComponent.*(..))"  )
//    public void after(JoinPoint joinPoint ) {
//        System.out.println("After = " );
//    }
//    @Around(value="execution(* spring.MyComponent.*(..))"  )
//    public void around(ProceedingJoinPoint joinPoint ) throws Throwable {
//        System.out.println("Around = " );
////        joinPoint.proceed();
//    }
}
