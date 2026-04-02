public class lcm {
 

//brute force / simple approach
    static int lcm1(int a , int b)
    {
        int res=Math.max(a, b); 
    while (true)
    {
        if (res%a==0&&res%b==0)
       { return res;}
        res++;
    }
        
    }



//efficient solution using gcd/euclidean 

static long gcd(int a, int b)
{
     if(b==0)
     {return a;}
     return gcd(b, a%b);
}

static long lcm2(int a , int b)
{
     return a*b/gcd(a,b);
}




public static void main(String[] args) {
    

    int a=55;
    int b=125;

    int answer= lcm1(a, b);
    long answer2=lcm2(a,b);

    System.out.println(answer);
    System.out.println(answer2);
}
}
