public class factorial {
    
//iterative method 
static int fact1(int x){
    int result=1;
    for (int i=1; i<=x ;i++)     
   {
result=result*i;
    }
    return result;
}

//recursive method
static int fact2(int x)
{
    if (x==0)
    {
    return 1;
    }
return x*fact2(x-1);
}


public static void main(String[] args) {
int x=6;
int answer1=fact1(x);
int answer2=fact2(x);
System.out.println(answer1);//iterative
System.out.println(answer2);//recursive 
}
}