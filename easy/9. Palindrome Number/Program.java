package main;

import java.util.Scanner;
import main.Solution;

public class Program {
	public static void main(String[] args) {
	
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();	
		
		boolean res = Solution.isPalindrome(x);
		System.out.printf("Is it a Palindrome? %c", res);
		
		sc.close();	
	}
}
