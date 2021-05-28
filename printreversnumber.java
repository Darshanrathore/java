import java.util.Scanner;
public class printreversnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
int A;
System.out.println("Enetr a number:-  ");
A=sc.nextInt();
int B =A%10;
int C=A/10;
System.out.println("revers of a number:-  "+B+C);
sc.close();
	
	}
	

}
