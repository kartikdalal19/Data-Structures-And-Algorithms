
// import com.sun.jdi.connect.Connector;

// public class palindrome_number {
    
// static boolean palindrome_number(int x){
// // int rev=0;
// // int temp= x;
// // while(temp!=0)
// // {
// //     int lastdigit =temp%10;
// //     rev=rev*10+lastdigit;
// //     temp=temp/10;
// // }
// // return(rev==x);


// String str = Integer.toString(x);

// System.out.println("string" + str);
// return 0;
// }

// public static void main(String[] args) {
//     int x=11911;


// //used for non static i.e object is to be created
//     // palindrome_number obj = new palindrome_number();
//     // System.out.println(obj.palindrome_number(x));

    
    
//     //for static code , object is not required
//     System.out.println(palindrome_number(x));
// }
// }







public class palindrome_number {

    static boolean palindrome_number(int x) {
        // Convert integer to string
        String str = Integer.toString(x);

        // Print string version of the number
        System.out.println("String: " + str);

        // Check if the string is a palindrome
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        int x = 11911;

        // Call the static method directly
        System.out.println("Is palindrome? " + palindrome_number(x));
    }
}
