package main;

public class Solution {
	
    public int[] getNoZeroIntegers(int n) {
    	
        int[] ans = new int[2];

        int a, b;

        for(int i = 1; i < n; i++){
            a = i;
            b = n - i;

            if(String.valueOf(a).contains("0") || String.valueOf(b).contains("0")){
            } else{
                ans[0] = a;
                ans[1] = b;

                return ans;
            }
        }

        return null;
    }
    
}