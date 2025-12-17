package main;

import java.util.HashMap;

public class Solution {
    public String intToRoman(int num) {

		StringBuilder sb = new StringBuilder();
        
		int[] list = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        int n = num;
		
		HashMap<Integer, String> tabelaHash = new HashMap<>(); 
		
		tabelaHash.put(1, "I");
		tabelaHash.put(4, "IV");
		tabelaHash.put(5, "V");
		tabelaHash.put(9, "IX");
		tabelaHash.put(10, "X");
		tabelaHash.put(40, "XL");
		tabelaHash.put(50, "L");
		tabelaHash.put(90, "XC");
		tabelaHash.put(100, "C");
		tabelaHash.put(400, "CD");
		tabelaHash.put(500, "D");
		tabelaHash.put(900, "CM");
		tabelaHash.put(1000, "M");
		
		while(n != 0){
			for(int i = 1; i < list.length; i++) {
				if(n < list[i]) {
					sb.append(tabelaHash.get(list[i-1]));
					n -= list[i-1];
					break;
				} else if(n > 999){
                    sb.append("M");
					n -= 1000;
					break;
                }
			}
		}

        return sb.toString();

    }
}
