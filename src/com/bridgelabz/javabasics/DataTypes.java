package com.bridgelabz.javabasics;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
	    System.out.println("Enter whole number :");
	    byte n = scanner.nextByte();
	    
	    System.out.println("Enter whole number :");
	    short num = scanner.nextShort();
	    
	    System.out.println("Enter whole number :");
	    int number = scanner.nextInt();
	    
	    System.out.println("Enter whole number :");
	    long no = scanner.nextLong();
	    
	    System.out.println("Enter decimal number :");
	    float decimal = scanner.nextFloat();
	    
	    System.out.println("Enter decimal number :");
	    double d  = scanner.nextDouble();
	    
	    System.out.println("Enter a character :");
	    char ch = scanner.next().charAt(0);
	    
	    System.out.println("Enter boolean value :");
	    boolean  b = scanner.nextBoolean();
	    
	    System.out.println("Enter any word :");
	    String word = scanner.next();
	    
         System.out.println(n);
         System.out.println(num);
         System.out.println(number);
         System.out.println(no);
         System.out.println(decimal);
         System.out.println(d);
         System.out.println(ch);
         System.out.println(b);
         System.out.println(word);
        
	}
}
