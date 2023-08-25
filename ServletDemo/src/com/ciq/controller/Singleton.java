package com.ciq.controller;

public class Singleton {
	private static Singleton Instance = new Singleton();

	private Singleton() {

	}
	 public static Singleton getinstance() {
		 return Instance;
	 }
	  
    public static void destory() {
    	if(Instance!=null) {
    		destory();
    		
    	}
    }
    public static void main(String[] args) {
		Singleton singleton=getinstance();
		System.out.println(singleton);
		Singleton singleton2=getinstance();
		System.out.println(singleton2);
		Singleton singleton3=getinstance();
		System.out.println(singleton3);
	}
    
}
