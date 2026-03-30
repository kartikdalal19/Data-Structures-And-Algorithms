public class divisor_1 {
    public static int div(int n)
    {
    int i;

    for (int i = 1; i*i<n; i++) {
        if (n%i==0)
        return i
    }


    }
}











// Given a positive integer value n. The task is to find how many numbers less than or equal to n have numbers of divisors exactly equal to 3.

// Examples:

// Input: n = 6
// Output: 1
// Explanation: The only number less than 6 with 3 divisors is 4 which has 1, 2 and 4 as divisors.
// Input: n = 10
// Output: 2
// Explanation: 4 and 9 have 3 divisors.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function exactly3Divisors() that takes n as input parameter and returns count of numbers less than or equal to n with exactly 3 divisors.

// Expected Time Complexity : O(n1/2 * n1/4)
// Expected Auxilliary Space :  O(1)

// Constraints :
// 1 <= n <= 109