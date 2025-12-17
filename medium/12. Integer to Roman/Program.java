package main;

public class Program {

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Example 1
        int num1 = 3749;
        System.out.println("Input: " + num1);
        System.out.println("Output: " + solution.intToRoman(num1));
        System.out.println("Expected: MMMDCCXLIX");
        System.out.println();

        // Example 2
        int num2 = 58;
        System.out.println("Input: " + num2);
        System.out.println("Output: " + solution.intToRoman(num2));
        System.out.println("Expected: LVIII");
        System.out.println();

        // Example 3
        int num3 = 1994;
        System.out.println("Input: " + num3);
        System.out.println("Output: " + solution.intToRoman(num3));
        System.out.println("Expected: MCMXCIV");
    }
}
