import java.util.Scanner;
public class Compoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
double principle;
double rate,time,amount,interest;
System.out.println("Enter principle:-");
principle=sc.nextDouble();
System.out.println("Enter rate:-");
rate=sc.nextDouble();
System.out.println("Enter time:-");
time=sc.nextDouble();
amount= principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
System.out.println("your Total compound amount is:-"+amount);
interest=amount-principle;
System.out.println("total Intrest is:-"+interest);
sc.close();
	}

}
