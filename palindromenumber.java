import java.util.Scanner;
public class palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N,M = 0,P;
	    
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	N=sc.nextInt();
	    int originalNum =N;
	    
	    
	    while (N!= 0) {
	      P= N % 10;
	      M= M * 10 + P;
	      N /= 10;
	    }
	    
	   
	    if (originalNum == M) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	  }
	
	}


