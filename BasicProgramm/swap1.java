// Swapping two number using 3rd variable 
import java.util.Scanner;
class swap1
{
public static void main (String args[])
{
int a=20;
int b=30;
int temp;
System.out.println("Before swaping :");
 System.out.println("a = "+a);
System.out.println("b = "+b);
/*Scanner sc = new Scanner (System.in);
System.out.println("Enter the first number :");
a=sc.nextInt();
System.out.println("Enter the seconnd Number :");
b=sc.nextInt();*/
 temp=a;
 a=b;
 b=temp;
 System.out.println("After swaping ");
 System.out.println("a = "+a);
 System.out.println("b = "+b);


}
}