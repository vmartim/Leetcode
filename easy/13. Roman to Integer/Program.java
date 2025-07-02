package main;

import java.util.Scanner;
import main.Solution;

public class Program {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero romano: ");
		String text = sc.nextLine();
		
		int ans = Solution.romanToInt(text);
		
		System.out.printf("Resposta: %d", ans);
		
		sc.close();	
	}
}
