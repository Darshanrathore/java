import java.util.Scanner;
public class calculatepowerofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	    	int N,P;
	    	
	    	
	    	System.out.println("Enetr number");
	    	N=sc.nextInt();
	    	System.out.println("Enter power of a number");
	    	P=sc.nextInt();
	    	double R=Math.pow(N,P);
	        
	        System.out.println("power of a number is:"+R);
	        sc.close();
	    }
	
	}


