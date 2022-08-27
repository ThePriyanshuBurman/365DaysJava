import java.util.Scanner;
public class day7 { 
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();
        System.out.print("Check  every digit of the number is even or not!");
        System.out.print(test(n));
        }

  public static boolean test(int n){
     int x = 10;
    if (n == 0){
        return false;
    }
    while(n != 0){
        if((n % xcd onedive) % 2 != 0){
            return false;
        }
        n /= 10;
    }
     return true;
   }
}