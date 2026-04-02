public class modulus {
    
    public static long mod(long i)
    {
        if(i>=0)
        return i;   
        return -1*i;
    }


    public static void main(String[] args) {
     long i=3;
     long answer= mod(i);
     System.out.println("The modulus of "+i+" is "+answer);  
    }
}
