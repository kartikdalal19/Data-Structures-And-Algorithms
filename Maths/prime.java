public class prime {


//simple approach

    static boolean prime1(int a)
    {
        if (a==1 && a%2==0 && a%3==0)
        {
            return false;
        }


        for(int i = 2; i<a ; i++ )
        {
            if(a%i==0)
            {return false;}
        }
        return true;
    }

//efficient approach 

static boolean prime2(int a)
    {
        if (a==1 && a%2==0 && a%3==0)
        {
            return false;
        }
        for(int i = 2; i*i<a ; i++ )
        {
            if(a%i==0)
            {return false;}
        }
        return true;
    }

  



    public static void main(String[] args) {
    
        int a=2;
        boolean answer=prime1(a);
        boolean answer2=prime2(a);
        System.out.println(answer);
        System.out.println(answer2);


    }
}
