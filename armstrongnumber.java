import java.util.Scanner;
public class armstrongnumber {



		public static void main(String[] args)  { 
			// TODO Auto-generated method stub
			
			int N, n;
			int A = 0, b;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number");
			N=sc.nextInt();
			n=N;
			System.out.println("Enter the number of digits");
			b=sc.nextInt();
			while(N!=0)
			{
				double r=N%10;
				A=(int) (A+(Math.pow(r, b)));
				N=N/10;
				
			}
			
			if(A==n)
				{
				System.out.println("Number is amstrong number");
				}
			
			
			else
				System.out.println("Number is not amstrong number");
		}

	}
