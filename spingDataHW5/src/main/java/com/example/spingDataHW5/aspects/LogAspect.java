package com.example.spingDataHW5.aspects;

import com.example.spingDataHW5.services.TaskService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Around("@annotation(com.example.spingDataHW5.annotations.TrackUserAction)")

    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("Пользователь запустил метод " + joinPoint.getSignature().getName() +
                " из класса " + joinPoint.getSourceLocation().getWithinType().getName());

        Object proceed = joinPoint.proceed();

        System.out.println("Выполнение метода завершено");

        return proceed;
    }
}
