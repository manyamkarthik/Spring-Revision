package org.example.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspect {

    private final Logger logger=Logger.getLogger(LoggerAspect.class.getName());
    @Around("execution (* org.example.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().getName()+"method called from aspect class");
        var start=Instant.now();
        Object result=joinPoint.proceed();
        var finish=Instant.now();
        logger.info("Time executed in milli seconds is "+ Duration.between(start,finish).toMillis());
        logger.info(joinPoint.getSignature().getName()+"method executed");
        return result;

    }
    @AfterThrowing(value = "execution(* org.example.services.*.*(..))",throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) {
        logger.log(Level.SEVERE,joinPoint.getSignature()+ " An exception thrown with the help of" +
                " @AfterThrowing which happened due to : "+ex.getMessage());
    }

    @AfterReturning(value = "execution(* org.example.services.*.*(..))",returning = "retVal")
    public void logStatus(JoinPoint joinPoint,Object retVal) {
        logger.log(Level.INFO,joinPoint.getSignature()+ " Method successfully processed with the status " +
                retVal.toString());
    }
}
