package com.programming.competitive;

import java.util.Scanner;

public class Fizzbuzz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)   
		{  
		//returns true if both the conditions return true  
		if (i%3==0 && i%5==0)   
		{   
		//prints if the number is multiple of 3 and 5  
		System.out.print("FizzBuzz");  
		}   
		//executes if the condition returns true  
		else if (i%3==0)   
		{  
		//prints if the number is multiple of 3  
		System.out.print("Fizz");  
		}   
		//executes if the condition returns true  
		else if (i%5==0)   
		{   
		//prints if the number is multiple of 5  
		System.out.print("Buzz");  
		}   
		else   
		{  
		//prints the number itself if the number is not divisible by both 3 and 5     
		System.out.print(i);  
		}  
		//prints space  
		System.out.print(","+" ");  
		}  
		//close the Scanner  
		sc.close();  
		}  
}

