import java.util.*;

public class Binary 
{

  static void search(int arr[], int key)
  {

        int low = 0 ;
        int high =arr.length - 1 ;
        int inc = 0;
        int mid;
     
      while(low<=high)
     {
       mid= (low+high)/2;

         if(arr[mid]==key)
         {
            System.out.println("The key is found at index : "+ mid);
            inc ++;
            break;
         }

         else if(arr[mid] > key)
         {
            high=mid-1;
         }

         else
         {
            low = mid+1;
         }
    
     }  

     if(inc == 0)
     {
        System.out.println("The key is not present int the array !");
     }
  
    }

    public static void main(String[] args) {
        int key;
        int n;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of the elements in the array : ");
        n = sc.nextInt();
         int arr[] = new int[n];

        System.out.println("Enter the elements in the array : ");
        for(int i=0 ; i<n ; i++)
        {
           arr[i]=sc.nextInt();
        }

        System.out.println("Enter the key that you want to search : ");
        key = sc.nextInt();

        search(arr, key);

        sc.close();
    }
}
