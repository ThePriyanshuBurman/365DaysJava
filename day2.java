import java.util.*;
public class day2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int op=s.nextInt();
        switch (op) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a * b);
            case 4 -> {
                if (b == 0) {
                    System.out.println("INVALID");
                }
                System.out.println(a / b);
            }
            case 5 -> {
                if (b == 0) {
                    System.out.println("INVALID");
                }
                System.out.println(a % b);
            }
            default -> System.out.println("INVALID OPERATOR");
        }
    }
}
