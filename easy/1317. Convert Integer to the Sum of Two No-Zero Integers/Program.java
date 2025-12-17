package main;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Ex1
        int n1 = 2;
        System.out.println("Input: " + n1);
        System.out.println("Output: " +
                Arrays.toString(solution.getNoZeroIntegers(n1)));

        // Ex2
        int n2 = 11;
        System.out.println("Input: " + n2);
        System.out.println("Output: " +
                Arrays.toString(solution.getNoZeroIntegers(n2)));

        // Ex3
        int n3 = 100;
        System.out.println("Input: " + n3);
        System.out.println("Output: " +
                Arrays.toString(solution.getNoZeroIntegers(n3)));
    }
}
