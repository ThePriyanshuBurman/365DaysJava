import java.util.*;
public class day4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int total=0;
        do {
            System.out.print("Enter a number:");
            total +=s.nextInt();
        }while (total<=100);
        System.out.println("Done: "+ total);
    }
}