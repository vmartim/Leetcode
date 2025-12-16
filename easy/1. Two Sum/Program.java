package main;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Ex1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Example 1 Output: " +
                Arrays.toString(solution.twoSum(nums1, target1)));

        // Ex2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Example 2 Output: " +
                Arrays.toString(solution.twoSum(nums2, target2)));

        // Ex3
        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Example 3 Output: " +
                Arrays.toString(solution.twoSum(nums3, target3)));
    }
}
