import java.util.Scanner;
public class tocheckPrimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int N,i=2;
System.out.println("Enter a Number :-");
N=sc.nextInt();
if (N%i!=N)
{
	System.out.println("your number is prime");

}
else if(N%N==1)
	System.out.println("your number is prime");
else if (N%2==N)
	
	System.out.println("your number is not prime");
sc.close();
}
}