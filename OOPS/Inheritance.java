class Cars
{
    String type;
    int power;

    Cars(){}

    Cars(String type , int power)
    {
        this.power = power;
        this.type = type;
    }

    void print()
    {
        System.out.println(this.power + " "+this.type);
    }
}





class LuxuryCars extends Cars
{
    String material;
}


class SuperCars extends LuxuryCars
{
    int turbo;
}


class ConceptCars extends SuperCars
{
    char Class;
}



public class Inheritance
{
 public static void main(String[] args)
 {
    Cars Kylaq = new Cars();
    Kylaq.power= 100;
    Kylaq.type="Compact-SUV";
    
    LuxuryCars Ferrari = new LuxuryCars();
    Ferrari.material = "Carbon-fiber";

    SuperCars Mustang = new SuperCars();
    Mustang.turbo = 4566;

    ConceptCars BatMobile = new ConceptCars();
    BatMobile.Class='S'; 


 }
}
