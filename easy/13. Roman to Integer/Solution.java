package main;

import java.util.HashMap;

public class Solution {
	public static int romanToInt(String s) {
		
		int n = 0;
		
		HashMap<Character, Integer> tabelaHash = new HashMap<>(); 
		tabelaHash.put('I', 1);
		tabelaHash.put('V', 5);
		tabelaHash.put('X', 10);
		tabelaHash.put('L', 50);
		tabelaHash.put('C', 100);
		tabelaHash.put('D', 500);
		tabelaHash.put('M', 1000);
		
		for(int i = 0; i < s.length(); i++){
			
			if(i < s.length() - 1) {
				
				if(tabelaHash.get(s.charAt(i)) < tabelaHash.get(s.charAt(i+1))) {
					
					n = n + (tabelaHash.get(s.charAt(i+1)) - tabelaHash.get(s.charAt(i)));
					i++;
					
				}else {
					
					n = n + tabelaHash.get(s.charAt(i));
					
				}
				
			}else {
				
				n = n + tabelaHash.get(s.charAt(i));
				
			}
			
		}
		
		return n;
	}
}
