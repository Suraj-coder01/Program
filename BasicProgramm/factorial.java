import java.util. Scanner;
class factorial{
    public static void main(String args[])
    {
     int n=6,fact=1;
     while(n>0)
     {
        fact= fact*n;
        n=n-1;
     }
     System.out.println("factolrial = " + fact);

    }
}
