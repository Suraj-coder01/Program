// Swapping two number without using 3rd variable 
import java.util.Scanner;
class swap2
{
public static void main(String args[]){
    int a = 20;
    int b = 50;
    System.out.println("Befor swapping Number");
    System.out.println("a = "+a);
    System.out.println("b = "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping Number ");
    System.out.println("a = "+a);
    System.out.println("b = "+b);
}
}
