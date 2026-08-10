// A constructor in Java is a special member that is called when an object is created. It initializes the new object’s state. It is used to set default or user-defined values for the object's attributes

// A constructor has the same name as the class.
// It does not have a return type, not even void.
// It can accept parameters to initialize object properties.

// Types : Default , Parameterized and Copy constructors



public class constructor
{
    
    public static class Car
    {
        int seats;
        String name;
        double length;

        //  Operator overloading 
        
        Car()   //default constructor
        {
            seats = 2;
            name = "Audi";
            length = 3.3;
        }

        Car(int x, String y , double z)  // Parameterized constructors  
        {
            seats = x;
            name = y;
            length = z;
        }
    }



    public static void main(String[] args)
    {


        // Default Constructor , with default values
        Car c1 = new Car();
        System.out.println("Default Constructor "+c1.seats+" "+c1.name+" "+c1.length);
       
       
        // Parameterised Constructor    
        Car c2 = new Car(5,"Skoda ", 4.66);
        System.out.println("Parameterized Constructor "+c2.seats+" "+c2.name+" "+c2.length);


    }
}