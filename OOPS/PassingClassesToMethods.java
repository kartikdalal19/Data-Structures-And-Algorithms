public class PassingClassesToMethods
{
    public static class Car
    {
        int seats;
        String name;
        double length;
        String type;
        int torque;
            void print()
            {
                System.out.println(seats+" "+name+" "+length+"m "+type+" "+torque+"nm");
            }
    }

    public static void main(String[] args)
    {    public static class Car
    {
        int seats;
        String name;
        double length;
        String type;
        int torque;
            void print()
            {
                System.out.println(seats+" "+name+" "+length+"m "+type+" "+torque+"nm");
            }
    }

    public static void main(String[] args)
    {
        Car c = new Car();
        c.length =  2.32;
        c.name = "skoda";
        c.seats = 5;
        c.torque= 431;
        c.type = "SUV";

        change(c);


        System.out.println(c.seats);


        c.print();   // accessing the method inside Car class using the object of the class
    }


    public static void change(Car c) {
        c.seats = 4;
        c.print();
    }
}
