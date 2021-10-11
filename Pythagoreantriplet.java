import java.util.*;
import java.io.*;

public class Pythagoreantriplet 
{
	 public static void main(String [] args)
         {
	        for (int n = 1; n < 500; n++) 
                {
	            for (int m = (n + 1); m < 500; m ++) 
                    {
	                int a = (m * m) - (n * n);
	                int b = 2 * m * n;
	                int c = (m * m) + (n * n);
	                if (a + b + c == 1000) 
                        {
	                    int product = a * b * c;
	                  
	                    System.out.println(product);
	                }
	                 
	            }   
	        }   
	    }
}