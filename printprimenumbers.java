import java.util.Scanner;
public class printprimenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 int i =0;
	     int N=0;
	     int A=0;
	         String  primeNumbers = "";
	         
	         System.out.println("Enter a number :- ");
	         A=sc.nextInt();
	         
	       for (i = 1; i <= A; i++)         
	       { 		  	  
	          int C=0; 	  
	          for(N =i; N>=1; N--)
		  {
	             if(i%N==0)
		     {
	 		C = C + 1;
		     }
		  }
		  if (C ==2)
		  {
		     
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to "+A +" are:-");
	       
	       System.out.println(primeNumbers);
	       sc.close();
	   }
	
		
	}


