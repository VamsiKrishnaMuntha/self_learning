import java.util.*;
public class SquaresDiff
{
	public static void main(String[] args) {
	    int i,j,n,sum=0,total=0,val;
	    Scanner in=new Scanner(System.in);
	    System.out.println("enter the n value");
	    n=in.nextInt();
	    for(i=1;i<=n;i++)
	    {
	        sum=sum+i*i;
	    }
	    for(j=1;j<=n;j++)
	    {
	        total=total+j;
	    }
	    val=(total*total)-sum;
		System.out.println("the difference between sum and squares of n is "+val);
	}
}