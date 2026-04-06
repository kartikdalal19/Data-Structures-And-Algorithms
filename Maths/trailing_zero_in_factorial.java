public class trailing_zero_in_factorial {
    
static int factorial(int x)
{

    //by calculating the factorial

    int result =1;
    for (int i = 1; i <=x ; i++){
        result*=i;}
    
int count1=0;

while(result%10==0)
{
    result=result/10;
    count1++;
}
System.out.println(count1);


    //without calculating the factorial
int count2=0;
for(int i=5;i<=x;i*=5)
{
count2=count2+x/i;

}
return count2;
}



public static void main(String[] args) {
    
    int x=4;
    int answer=factorial(x);
    System.out.println(answer);
}

}
