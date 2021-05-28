import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
		int A,B=1;
		System.out.println("Enter a number:-");
		A=sc.nextInt();
		for(int i=1;i<=A;i++)
			B=i*B;
System.out.println("Fctorial of a given number is :-"+B);
sc.close();
	}

}
