
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {



//print/output


        System.out.println("JAI SHREE RAM");
        System.out.println("hello world this is do what you can do in your life donot rest , give it your all my first code in java , so let me try to code it code so that i ca write good code in the upcomin future hello how are you i am doing fine so donot worry about me i am fine");
        System.out.println("hello world this is do what you can do in your life donot rest , give it your all my first code in java , so let me try to code it code so that i ca write good code in the upcomin future hello how are you i am doing fine so donot worry about me i am fine\n");
        System.out.print("hello world this is do what you can do in your life donot rest , give it your all my first code in java , so let me try to code it code so that i ca write good code in the upcomin future hello how are you i am doing fine so donot worry about me i am fine");
        System.out.println("\n*\n**\n***\n****\n*****");       


//variables


        String name ="King"; 
        int a;
        int b;
        b=3;
        a=2;
        int sum = a+b;
        System.out.println(sum);
        System.out.println(name);
     

//input


        Scanner jj= new Scanner(System.in);
        int name1 = jj.nextInt();
        int name2 = jj.nextInt();

        int c = name1+name2;
        System.out.println(name1+name2);
        System.out.println(c);



//conditional statements 


//if-else
// Scanner nn = new Scanner(System.in);

           int age =jj.nextInt();



          if(age<18 && age!=0 )
     {
           System.out.println("Underage");
     }

         else if(age>18)
     {
           System.out.println("Adult");
     }

        else if(age==0)
     {
           System.out.println("Invalid");
     }
    


//switch

           int num = jj.nextInt();

 
         switch(num) {
    case 1 :
        System.out.println("GOOD");        
        break;


     case 2:
        System.out.println("BETTER");        
                break;



                case 3 :
                System.out.println("BEST");        
                        break;
    default:
        System.out.println("invalid");
        
     }



//loops




//for loop


for (int i = 0; i < 10; i++) {
    
    System.out.println(i);
}
System.out.println("\n");


//while loop

int j=10;

while(j>7)
{
    System.out.println(j);
    j--;
}

System.out.println("\n");


//do while loop



int k =10;
do { 
    System.out.println(k);
    k--;
} while (k>7);






System.out.println("hello");
System.out.println("hello");

//jj.close();

    }
}
