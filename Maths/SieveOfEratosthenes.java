
// import java.util.Vector;

// public class seive_of_eratosthene{

// public static int prob(int n)
// {

// Vector<Boolean> isprime(n+1;i++);
// for (int i = 2; i <=n; i++) {
//     if(isprime(i)){
//         System.out.println(i);
//         for (int j = i*i; j <=n; j++) {
//             isprime[j]=false;
//         }
//     }
// }





// }

// public static void main(String[] args) {
    
// }


// }


import java.util.Arrays;

public class SieveOfEratosthenes {

    // Function to implement Sieve of Eratosthenes
    public static void sieve(int n) {
        // Create an array of booleans, initially assuming all numbers are prime
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);  // Initialize all entries as true (prime)

        // 0 and 1 are not prime numbers
        isPrime[0] = isPrime[1] = false;

        // Sieve of Eratosthenes algorithm
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as non-prime
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print the prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();  // For newline after printing all primes
    }

    public static void main(String[] args) {
        int n = 182;  // Example input, we will find all primes <= 30
        System.out.println("Prime numbers less than or equal to " + n + ":");
        sieve(n);
    }
}
