// Final

// The final keyword in Java is a non-access modifier used to restrict modification of variables, methods, and classes.
//  It helps ensure immutability, maintain integrity, and prevent unintended changes. 




// Static

// The static keyword in Java is used for memory management and belongs to the class rather than any specific instance. 
// It allows members (variables, methods, blocks, and nested classes) to be shared among all objects of a class.

//     - Memory is allocated only once when the class is loaded.
//     - No object creation is needed to access static members; use the class name directly.
//     - Static methods and variables can’t access non-static members directly.
//     - Static methods can’t be overridden because they belong to the class, not instances.


class Cricketer
{
    final String country = "India";
    int runs;
    static String name = "Dhoni" ;
    double avg;
}



public class FinalAndStatic
{   
   public static void main(String[] args)
   {
    Cricketer c1 = new Cricketer();  

       // c1.country = "England";         //Error ! - country is made final , that's why it cannot be changed
    

       c1.name = "Virat Kholi";
       System.out.println(c1.name);  
       // output : Virat Kholi
       // Although the default value was set to "Dhoni" but it was modified to "Virat Kholi"


    Cricketer c2 = new Cricketer();
        System.out.println(c2.name);    // As "name" was made static , after assigning a value to it , it's value is now assigned to all the objects of the class Country. 
   } 
}
