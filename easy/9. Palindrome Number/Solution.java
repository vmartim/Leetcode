package main;

public class Solution {
    public static boolean isPalindrome(int x) {
    	
		String textX = String.valueOf(x);
		int n = textX.length();
		
    	for(int i = 0; i < n / 2; i++) {
    		if(textX.charAt(i) != textX.charAt(n - i - 1)) {
    			return false;
    		};
    	}
    	
        return true;
    }
}