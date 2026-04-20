import java.util.Scanner;
public class armstrong {

    public static void main(String[] args) {
         int n = 153, temp,rev=0,r=1;
        temp = n;
        while(n>0)
        {
            r=n%10;
            rev = rev + r*r*r;
            n = n/10;
    }
    if(rev==temp)
        System.out.println("Armstrong Number ");
    else
        System.out.println("Not an Armstrong Number ");
}
}