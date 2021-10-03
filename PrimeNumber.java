import java.util.*;
public class PrimeNumber
{
	public static void main(String[] args) 
        {
	         int count=0,i;
                 int num =0;
       
                 String  primeNumbers = "";

                for (i = 1; i <= 10000000; i++)  
                { 		  	  
                       int counter=0; 	  
                       for(num =i; num>=1; num--)
	               {
                              if(i%num==0)
	                      {
	                             counter = counter + 1;
	             
	                      }
	              }
	              if (counter==2)
	              {
	                    count=count+1;
	              }	
	              if(count==10001)
	              {
	                     System.out.println("The 10001st Prime Number is: "+i);
	                     break;
	              }
	  
               }
               System.out.println(count);
       
	}
}