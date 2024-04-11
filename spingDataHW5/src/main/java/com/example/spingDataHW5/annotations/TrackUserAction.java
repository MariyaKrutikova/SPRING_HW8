package com.example.spingDataHW5.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD) //Аннтотация для метод
@Retention(RetentionPolicy.RUNTIME) //действует только во время выполнения кода
public @interface TrackUserAction {
}
