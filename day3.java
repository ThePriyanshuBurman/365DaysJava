import java.util.*;
public class day3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=s.nextInt();
        int ans=0;
        while (n>0){
            int rem=n%10;
            n/=10;
            ans=ans*10+rem;
        }
        System.out.println("Reverse of the number is "+ans);
    }
}