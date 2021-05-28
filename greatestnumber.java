import java.util.Scanner;
public class greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int A,B,C;
System.out.println("Enetr three Numbers");
A=sc.nextInt();
B=sc.nextInt();
C=sc.nextInt();


if (A>B&&A>C)
System.out.println("Greatest Number is:- "+A);
else if (B>C)
	System.out.println("Greatest number is :- "+B);
else 
	System.out.println("Greatest number is :- "+C);
sc.close();
	}

}
