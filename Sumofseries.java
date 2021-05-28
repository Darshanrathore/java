import java.util.Scanner;
public class Sumofseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B,C=0;
		System.out.println("Enter a number :-");
		A=sc.nextInt();
		for(B=1;B<=A;B++)
			C=C+B;
		System.out.println("Sum of series is:-"+C );
	
		
		sc.close();
		

	}

}
