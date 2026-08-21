// The private keyword in Java is an access modifier that enforces the highest level of restriction,
//  making members accessible only within the specific class where they are declared. 
// This principle is essential for achieving encapsulation and data hiding in object-oriented programming. 

 class Students
    {
        String name;
        private int rno;   // default vaule of int is 0
        double cgpa;

        void print()   // getter
        {
            System.out.println(name+" " + cgpa + " " + rno);
        }


        void SetRno(int x)  // setter
        {
            rno = x;
        }
    }
   

public class PrivateKeyword
{

    
    public static void main(String[] args)
    {
        Students s1 = new Students();
        s1.cgpa = 9.9;
        s1.name ="Jay";


        // s1.rno =456;   
        // System.out.println("Case 1 :-  Aceessing and printing private rno ::: "+"NAME: "+s1.name+" CGPA : " + s1.cgpa + " RNO : " + s1.rno);

        //  PrivateKeyword.java:19: error: rno has private access in Students







        // Now that rno is private entirty of Students class , it can only be accessed with in that class only
        // however we can indirectly access it , by using an method that is defined in that Student class:-

        System.out.println("Case 2 :-  Accessing and printing private rno by calling a method of the Students class : ");
        s1.print();



        // using same we can also set values to this private 
        System.out.println("Case 3 :-  Modifying and printing private rno by calling a method of the Students class : ");
        s1.SetRno(34);

        s1.print();

    }
}
