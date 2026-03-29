public class addition_under_modulo {
    public static long modulo(long a, long b)
    {

long mod= 1000000007;

return (a % mod + b % mod) % mod;
    }

public static void main(String[] args) {
     long a=9223372036854775807L;
     long b=9223372036854775807L;

    long answer = modulo(a, b);


System.out.println(answer);


}

}








//{ Driver Code Starts
//Initial Template for Java

// import java.io.*;
// import java.lang.*;

// class GFG
// {
//     public static void main(String args[])throws IOException
//     {
//         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
//         //taking testcases
//         int t = Integer.parseInt(read.readLine());
        
//         while(t-- > 0) {
//             String[] str = read.readLine().trim().split(" ");
            
//             //taking input a and b
//             Long a = 9223372036854775806;
//             Long b = 9223372036854775806;
            
//             //calling method sumUnderModulo()
//             System.out.println(new Solution().sumUnderModulo(a,b));
        
// System.out.println("~");
// }
//     }
// }
// // } Driver Code Ends


// //User function Template for Java

// class Solution {
//     public static long sumUnderModulo(long a, long b){
//         // code here
//         long sum=a+b;
        
//         return (sum)%(1000000007);
        
//     }   
// }








































// a = 9223372036854775807
// b = 9223372036854775807
// Output: 582344006
// Explanation: 
// 9223372036854775807 + 9223372036854775807 
// = 18446744073709551614.
// 18446744073709551614 mod (109+7)
// = 582344006