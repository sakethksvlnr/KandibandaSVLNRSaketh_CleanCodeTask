import java.io.*;
import java.util.*;
import java.lang.*;
class Interest
{
public static void main(String[] args)
{
int n;
double r,SI,p;
double CI;
Scanner sc=new Scanner(System.in);

System.out.println("Enter Information");
System.out.println("-------------------");
System.out.println("Enter Principal Amount");
p=sc.nextDouble();
System.out.println("Enter number of years");
n=sc.nextInt();
System.out.println("Enter rate of interest");
r=sc.nextDouble();
SI=(p*n*r)/100;
System.out.println("Simple Interest is"+SI);
CI=p * Math.pow(1 + (r / 100), n );
System.out.println("Compound Interest"+CI);





}
}