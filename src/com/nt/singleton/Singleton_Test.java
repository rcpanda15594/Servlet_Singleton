package com.nt.singleton;

public class Singleton_Test {

	public static void main(String[] args) {
		
		PrinterUtil pu1=null,pu2=null ,pu3=null;
		
		//get instance
		
         pu1=PrinterUtil.getInstance();
         pu2=PrinterUtil.getInstance();
       
         System.out.println(pu1==pu2);
         
         System.out.println(pu1.hashCode());
         System.out.println(pu2.hashCode());
	}//main method

}//class
