package com.spec;

public class DemoClass {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		float f=4.5f;
		int i;
		i=(int)f;//explicit conversion
		
		int num=90;
		f=num;//implicit conversion
		System.out.println(f);
		long l1=90000;
		int i1=(int)l1;//narrowing
		
		
		float f1=56.78f;
		double d1=f1;//widening
		
		int num1=5,num2=7;
		System.out.println(num1&num2);
		System.out.println(num1|num2);
		
		System.out.println(num1>>1);//makes num half
		System.out.println(num1<<1);//makes num double
		
		
		int a=89,b=145, c=456;
		System.out.println(a>b?a:b);

	}

}
