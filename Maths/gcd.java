public class gcd {

    //metod euclidean algorithm
    static int gcd1(int a, int b)
    {
        if (a==0) 
        {
            return b;
        }

        if (b==0)
        {
            return a;
        }

        if(a==b)
        {
            return a;
        }

        if(a>b)
        {
            return gcd1(a-b,b);
        }
        return gcd1(a,b-a);

    }




//modified euclidean algorithm
static int gcd2(int a , int b)
    {
        if (b==0)
        return a;
return gcd2(b, a%b);
    }




//simple / naive approach
static int gcd3(int a, int b)
{
    int res=Math.min(a, b);
    while(res>0)
    {
        if(a%res==0&&b%res==0)
        {
            break;
        }
        res--;
    }
    return res;
}



public static void main(String[] args) {
    int a=12;
    int b=15;
    int answer1 = gcd1(a,b);
    int answer2=gcd2(a, b);
    int answer3=gcd3(a, b);
    System.out.println(answer1);
    System.out.println(answer2);
    System.out.println(answer3);
}

}
