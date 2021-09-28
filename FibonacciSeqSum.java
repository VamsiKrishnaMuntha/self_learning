
import java.util.*;
public class FibonacciSeqSum
{

	public static void main(String[] args) 
        {
		System.out.println("enter the range");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int c=0;
		Integer arr[]=new Integer[a];
		arr[0]=1;
		arr[1]=2;
		for(int i=2;i<a;i++) 
                {
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(int i=0;i<a;i++) 
                {
			if(arr[i]%2==0) 
                        {
				c+=arr[i];
			}
		}
		System.out.println("the sum of even numbers in fibonacci series is "+c);
	}

}