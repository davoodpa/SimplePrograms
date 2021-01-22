package com.cloudchain.training2;

public class Apple2 {
	public static void main(String[] args)
	{
		String fruitName = "Apple" ;
		String b = fruitName.toUpperCase();
		System.out.println("Length of the string is "+b.length());
		for (int i=0;i<b.length();i++)
		{
		System.out.println(b.charAt(i)+" " +i);	
		}
		
	}

}
