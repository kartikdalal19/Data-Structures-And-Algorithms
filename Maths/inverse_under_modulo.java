public class inverse_under_modulo {
    public static int inv_mod(int n , int m)
    {
for(int i =1 ; i<m ; i++)
{
    if((n*i)%m==1)
    {
        return i;
    }
}   
        return -1;
    
 
     
}
   public static void main(String[] args) {
        int n =10;
        int m=17;
        int answer = inv_mod(n, m);
        System.out.println(answer); 
    }
}
