package com.jm2006.learn.annotation.cust;

@MyAnnotation(author = "Karan", createdDate = "2018-04-02", description = "This is annotation class.", revisionNumber=3)
public class MyClassWithAnnotation {

	public void myMethod1() {
		System.out.println("Method 1");
	}

//	@MyAnnotation(author = "Karan", createdDate = "2018-04-02", description = "This is annotation class.", revisionNumber=3)
	public static void myMethod2() {
		System.out.println("Method 2");
	}

}

