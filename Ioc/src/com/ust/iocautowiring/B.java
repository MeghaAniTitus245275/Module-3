package com.ust.iocautowiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	
	A a;//similar to int x;
	public B() {
		// TODO Auto-generated constructor stub
	}
	
	public B(A a)
	{
		this.a =a;
		System.out.println("from B() constructor....");
	}
	@Qualifier("a")
	public void setA(A a)
	{
		
		//byNamebyType will use setter injection
		System.out.println("set A() called....");
		this.a = a;
	}
	
	@PostConstruct//this annotation treats the following method as init()
	public void setUp()
	{
		System.out.println("from setUp()....");
	}
	
	@ PreDestroy
	public void windUp()
	{
		System.out.println("from windUp()....");
	}

}
