package com.ivaga.generics;

public class GenericClass<T> {
	   
	  private T t;
	 
	  public void add(T t) {
	    this.t = t;
	  }
	 
	  public T get() {
	    return t;
	  }
	 
	  public static void main(String[] args) {
	    GenericClass<Integer> integerGenericClass = new GenericClass<Integer>();
	    GenericClass<String> stringGenericClass = new GenericClass<String>();
	 
	    integerGenericClass.add(new Integer(10));
	    stringGenericClass.add(new String("HIHI"));
	 
	    System.out.printf("整型值为 :%d\n\n", integerGenericClass.get());
	    System.out.printf("字符串为 :%s\n", stringGenericClass.get());
	  }
	}
