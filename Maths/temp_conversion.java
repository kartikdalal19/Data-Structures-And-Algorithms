public class temp_conversion {
    public static double convert(int c)
{
return (c*1.8)+32;
}

public static void main(String[] args) {
    int c=0;

    double answer=convert(c);
    System.out.println("c="+c+" and f="+answer);
}
}
