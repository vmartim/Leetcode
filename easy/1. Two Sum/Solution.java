package main;

public class Solution {
	
    public int[] twoSum(int[] nums, int target) {
    	
        int[] vect = new int[2];

        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    vect[0] = i;
                    vect[1] = j;
                    return vect;            
                }
            }
        }

        vect[0] = 0;
        vect[1] = 0;
        return vect;
    }
    
}
