import java.util.Scanner;
public class Swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int Z,No1,No2;
		System.out.println("Enter first number No1:-");
		No1=sc.nextInt();
		System.out.println("Enter second number NO2:-");
		No2= sc.nextInt();
		System.out.println("---------------------");
		System.out.println("Before swapping numbers are:-"+No1+" "+No2);
		Z=No1;
		No1=No2;
		No2=Z;
		System.out.println("After swapping numbers are:-"+No1+" "+No2);
		sc.close();
		
		

	}

}
