import java.util.ArrayList;

// class roots{ 
//     public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
//         // Create an ArrayList to store the roots
//         ArrayList<Integer> result = new ArrayList<>();
        
//         // Calculate the discriminant
//         int discriminant = b * b - 4 * a * c;
        
//         if (discriminant < 0) {
//             // If discriminant is negative, roots are imaginary, return [-1]
//             result.add(-1);
//         } else {
//             // If discriminant is non-negative, calculate the real roots
//             double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
//             double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
            
//             // Find the greatest integer less than or equal to each root
//             int root1Int = (int) Math.floor(root1);
//             int root2Int = (int) Math.floor(root2);
            
//             // Add the roots to the ArrayList in descending order
//             if (root1Int >= root2Int) {
//                 result.add(root1Int);
//                 result.add(root2Int);
//             } else {
//                 result.add(root2Int);
//                 result.add(root1Int);
//             }
//         }
        
//         // Return the ArrayList containing the roots
//         return result;
//     }
// }

class roots{

    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
    ArrayList<Integer> result = new ArrayList<>();

int determinant =b*b-4*a*c;


if(determinant<0){
result.add(-1);
}

else{
    double root1= (-b +Math.sqrt(determinant))/2.0*a;
    double root2= (-b -Math.sqrt(determinant))/2.0*a;



int root1Int =(int)Math.floor(determinant);
int root2Int =(int)Math.floor(determinant);





if(root1Int>root2Int){
result.add(root1Int);
result.add(root2Int);
}

else{
    result.add(root2Int);
    result.add(root1Int);
}

    
    }

return result;
}



public static void main(String[] args) {
    


    roots root_solution= new roots();

ArrayList<Integer> root_3 = root_solution.quadraticRoots(2,3 ,4);


ArrayList<Integer> root_4 = root_solution.quadraticRoots(1, 3, 1);


System.out.println("roots are : " + root_3 + " and " + root_4);



}

}