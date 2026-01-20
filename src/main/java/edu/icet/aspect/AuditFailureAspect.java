package edu.icet.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AuditFailureAspect {

    @Around("@annotation(edu.icet.annotation.AduitFailure)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{

        //Before Execution
        long start = System.currentTimeMillis();

        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        Object proceed = joinPoint.proceed();

        //End Execution
        long end = System.currentTimeMillis();
        log.info("Method Name |{}",name);
        log.info("Recieved Arguments |{}",args);
        log.info("Execution Time |{}",end-start);
        return proceed;
    }
}
