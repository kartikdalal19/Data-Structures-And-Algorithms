//package geeks;
public class countdigits {
  
    static int countDigit(long n)	{


        if (n==1||n==0)
return 1;
double digits = 0;
for (int i = 2; i <= n; i++){
  digits = digits + Math.log10(i);
}

return (int)Math.floor(digits);

	}

    public static void main(String[] args) {


		long n = 10000;

        int answer1=countDigit(n);
		System.out.print("Number of digits : " + answer1 );


    }
}




