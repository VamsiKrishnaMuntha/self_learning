import java.io.*;
import java.util.*;
public class LargestPrimeFactor 
{

	public static void main(String[] args) 
        {
		Scanner sc=new Scanner(System.in);
		long a;
		a=sc.nextLong();
		long p=-1;
		while(a%2==0) 
                {
			p=2;
			a>>=1;
		}
		while(a%3==0) 
                {
			p=3;
			a=a/3;
		}
		for(int i=5;i<=Math.sqrt(a);i+=6) 
                {
			while(a%i==0) 
                        {
				p=i;
				a=a/i;
			}
			while(a%(i+2)==0) 
                        {
				p=i+2;
				a=a/(i+2);
			}
		}
		if(a>4) 
                {
			p=a;
		}
		System.out.println(p);
	}

}