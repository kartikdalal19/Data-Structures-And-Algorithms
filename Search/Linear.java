// Linear Search case 1


// public class Linear{
//     public static void main(String args[]){

//         int[] arr = {1,2,3,4,5};

//         int key = 5;
//         int inc = 0;
//         for(int i = 0; i<arr.length;i++){
//             if(arr[i]==key){
//                 System.out.println("The Key "+key+" is found at index :" + i);
//                 inc++;
//             }
//         }
//         if(inc==0){
// System.out.println("The key is not present in the array");
//         }

//     }
// }





// Linear Search case 2
import java.util.*;
public class Linear{
    static void search(int arr[],int key){
        for(int i =0; i<arr.length;i++){
             if(arr[i]==key)
                   {System.out.println("The key is fount at index : " + i);}

    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;
        int key;
        
        System.out.println("Please Enter the number of elements in the array : ");
            n = scanner.nextInt();

        int arr[]= new int[n];
        System.out.println("Please Enter the elements in the array :");
            for(int i = 0; i<n;i++)
            {
             arr[i] = scanner.nextInt();
            }

        System.out.println("Enter the element that you want to search :");
        key = scanner.nextInt();

        search(arr, key);
        scanner.close();
    }
}







