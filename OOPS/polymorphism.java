// Polymorphism in OOP means "many forms," allowing a single interface (like a method name) to represent different 
// underlying data types or perform different actions, enabling objects of different classes to respond uniquely to the same message,
//  which makes code flexible and reusable, often achieved through inheritance ( method overriding) and overloading. 


public class polymorphism 
{

    public static class Dog
    {
        void speak()
        {
            System.out.println("Bark");
        }
    }

    public static class Cat
    {
         void speak()
        {
            System.out.println("Meows");
        }
    }

    public static class Lion
    {
         void speak()
        {
            System.out.println("Growls");
        }
    }

    public static class Human
    {
         void speak()
        {
            System.out.println("speaks");
        }
    }


    public static void main(String []args)
    {

        Human h = new Human();
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();

        h.speak();
        d.speak();
        c.speak();
        l.speak();
    }
}
