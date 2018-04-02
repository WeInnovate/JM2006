package com.jm2006.learn.annotation.cust;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface MyAnnotation {

	public String author();

	public String createdDate();

	public String reviewer() default "Atul Dwivedi";

	public String description();
	
	public int revisionNumber() default 1;

}
