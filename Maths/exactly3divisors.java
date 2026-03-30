import java.util.Arrays;
public class exactly3divisors {
    
    public static int sieve(int n){

int limit= (int)Math.sqrt(n);

        boolean isPrime[] = new boolean[limit+1];

       Arrays.fill(isPrime, true);

      isPrime[0]=isPrime[1]=false;
      
for (int i= 2;  i*i<=limit ; i++){
    if (isPrime[i])
    {
        for (int j =i*i; j <=limit; j+=i)
        {
           isPrime[j]=false;
   
        }
    }
}


int count=0;

for (int i = 2; i <=limit; i++){

    if(isPrime[i] && i<=n)
    count++;





}
        return count;
}   



    public static void main(String[] args) {
        int n = 6;  // Example input, we will find all primes <= 30
        System.out.println("Count of numbers less than or equal to " + n +" with exactly 3 divisors are : " + sieve(n));
    }
}







//     // Function to implement Sieve of Eratosthenes
//     public static int sieve(int n) {


//         int limit= (int)Math.sqrt(n);
//         // Create an array of booleans, initially assuming all numbers are prime
//         boolean isPrime[] = new boolean[limit+ 1];
//         Arrays.fill(isPrime, true);  // Initialize all entries as true (prime)

//         // 0 and 1 are not prime numbers
//         isPrime[0] = isPrime[1] = false;

//         // Sieve of Eratosthenes algorithm
//         for (int i = 2; i * i <= limit; i++) {
//             if (isPrime[i]) {
//                 // Mark multiples of i as non-prime
//                 for (int j = i * i; j <= limit; j += i) {
//                     isPrime[j] = false;
//                 }
//             }
//         }
// int count=0;
//         // Print the prime numbers
//         for (int i = 2; i <= limit; i++) {
//             if (isPrime[i] && i*i<=n) {
//                count++;
//             }
//         }
//        return count;
//     }
