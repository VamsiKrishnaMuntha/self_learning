package abstractdemo;
import java.util.Scanner;

public class Patient {
	String name;
    int age;
    String location;
    String emailid;
    long phoneNo;
 
    public static void main(String[] args)
    {  String username;
	String password;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the username");
	username=sc.next();
	System.out.println("Enter the password");
	password=sc.next();
	
	
	if(username==username&&password==password) {
		
		System.out.println("Login Successful");
	}
	else {
		System.out.println("Invalid login Credentials");
		
	}  
    	int n=5;
    	int a=10000;
    	int num=5000;
    	int a1=20000;
    	int num1=10000;
    	int a2=15000;
    	int num2=5500;
          
          String name;
          int age;
          
          String emailid;
          long phoneNo;
 
  Scanner sc1=new Scanner(System.in);

           
  System.out.println("Enter Name :" );
   name=sc1.nextLine();
  System.out.println("Enter Age :" );
   age=sc1.nextInt();
  System.out.println("Enter Email_id :" );
  emailid=sc1.nextLine();
  System.out.println("Enter Phone_No :" );
  phoneNo=sc1.nextLong();

 System.out.println("........Patient Details.........");
 System.out.println(" ");
 System.out.println("Name : " +name);
 System.out.println("Age : " +age);
 System.out.println("Email_id : " +emailid);
 System.out.println("Phone_No : " +phoneNo);

              
          
  System.out.println("  ");
  System.out.println(" 1. Online Doctor Consultation :");
  System.out.println(" 2. Online theraphy :");
  System.out.println("Which are the services are you looking for : ");
        int ch;
        ch=sc1.nextInt();
 switch(ch)
         {
 case 1: System.out.println("Thanks for selecting 1");
                   break;
case 2: System.out.println("In theraphy we have these specialists : ");
System.out.println("1. physiotherpist\n2. dentist\n3. child specialist");
     System.out.println("Enter your choice : ");
       ch=sc1.nextInt();
          switch(ch)
           {
      case 1: System.out.println("Choose Doctor");
                                        
           System.out.println("Enter illness type " );
          String str4=sc1.nextLine();
         System.out.println("Enter timings");
          String str1=sc1.nextLine();
   System.out.println("We fixed your appointment with doctor"+str1);
   System.out.println("Choose the payment type:");
   String st=sc1.nextLine();
   System.out.println("Enter the amount :");
   double dr=sc1.nextDouble();
   if(a%num==0) {
   System.out.println("Transaction successfull");
   }
   else {
	   System.out.println("Invalid transactions");
   }
   
                break;

   case 2: System.out.println("Choose Doctor");
                                        
      System.out.println("Enter illness type :" );
   String str5=sc1.nextLine();
      System.out.println("Enter timings");
      String str2=sc1.nextLine();
   System.out.println("We fixed your appointment with doctor  "+str2);
   System.out.println("Enter the amount :");
   double dr1=sc1.nextDouble();
   if(a1%num1==0) {
   System.out.println("Transaction succesfull");
   }
   else {
	   System.out.println("Invalid transactions");
   }
                                        

     case 3: System.out.println("Choose Doctor");
                                        
   System.out.println("Enter illness type :" );
      String str6=sc1.nextLine();
 System.out.println("Enter timings");
 String str3=sc1.nextLine();
 System.out.println("We fixed your appointment with doctor  "+str3);
 System.out.println("Enter the amount :");
 double dr2=sc1.nextDouble();
 if(a2%num2==0) {
 System.out.println("Transaction succesfull");
 }
 else {
	   System.out.println("Invalid transactions");
 }
              
                        break;
             
          
          
                         // break;
                  
}}}}
		
        
		