// Find a number 353 is polindrome or not 
import java.util.Scanner;
class polindrome
{
    public static void main(String args[])
    {
        int n = 353, temp,rev=0,r;
        temp = n;
        while(n>0)
        {
            r=n%10;
            rev = rev*10+r;
            n = n/10;
        } 
        if(rev==temp)
        {
            System.out.println("Polindrome Number ");
        }
        else
        {
            System.out.println("Not a Polindrome ");
        }

    }
}
