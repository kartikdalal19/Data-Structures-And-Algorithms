public class A2dArrayMinOfMaxOfAllRows {
   public static void main(String args[]) 
   {
// int arr[][] = new int[3][3];
int arr[][] = {{8,2,3},{4,5,6},{7,1,9}};
int min = Integer.MAX_VALUE;
for(int i = 0; i<arr.length ; i++)
{

	int max = Integer.MIN_VALUE;
	
	for(int j = 0 ; j < arr[0].length; j++)
	{
		int ma = arr[i][j];
		if(ma>max)
		{
			max = ma;
		}
	}

	if(max<min)
		{
		min = max;
		}
}
System.out.println(min);
}
}