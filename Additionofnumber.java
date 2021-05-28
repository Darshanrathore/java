import java.util.Scanner;
public class Additionofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int No1,No2;
int result;
System.out.println("Enter first number No1:-");
No1=sc.nextInt();
System.out.println("Enter second number No2:-");
No2= sc.nextInt();
result=No1+No2;
System.out.println("Addition of two numbers are :-"+result);
String A,B;
String C;
System.out.println("Enter first character A:-");
A=sc.next();
System.out.println("Enter second character B:-");
B=sc.next();
C=A+B;
System.out.println("Addition of character is:-"+C +" ");
sc.close();

	}

}
