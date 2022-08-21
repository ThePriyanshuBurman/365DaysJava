import java.util.*;

public class day1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=s.nextInt();
        System.out.println(a);
        System.out.println("Enter another number:");
        int b=s.nextInt();
        int c =a+b;
        System.out.println(a+" + "+b+" = "+c);
    }
}
