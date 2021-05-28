import java.util.Scanner;
public class Sumofevenandoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,evensum=0,oddsum=0;
		System.out.println("enter a number No:-");
		A=sc.nextInt();
		for(int i=1;i<=A;i++)
			if(i%2==0)
				evensum+=i;
			else 
				oddsum+=i;
		System.out.println("addition of even numbers:="+evensum);
		System.out.println("additon of odd numbers:= "+oddsum);
		sc.close();
	}


}
