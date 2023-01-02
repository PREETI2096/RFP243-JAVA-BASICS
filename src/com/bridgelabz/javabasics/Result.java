package com.bridgelabz.javabasics;
import java.util.Scanner;
public class Result {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your percentage:");
			int percentage = scanner.nextInt();
			
			if(percentage >= 70 && percentage <=100 ) { 
				System.out.println("First class with Distinction");
			}
			else if (percentage >= 60 && percentage < 70 ) {
				System.out.println("First Class");
			}
			else if (percentage >= 50 && percentage < 60 ) {
				System.out.println("Second Class");
		      }
			else if (percentage >= 35 && percentage < 50 ) {
					System.out.println(" Just Pass");
		        }
			else if (percentage < 35 && percentage > 0) {
						System.out.println("Fail!");
				}
			else
			     System.out.println("Invalid Percentage");
		}
	}