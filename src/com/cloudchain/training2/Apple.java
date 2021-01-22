package com.cloudchain.training2;

public class Apple {

	public static void main(String[] args) {
		String fruitName = "apple";
		int length = fruitName.length();
		System.out.println(length);
		for(int i=0;i<fruitName.length();i++)
		{
			System.out.println(fruitName.charAt(i));
			System.out.println(i);
		}
	}

}
