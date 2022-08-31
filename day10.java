import java.util.Scanner;
public class day10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int r=s.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            int spaces=2*(r-i);
            for (int j=1;j<=spaces;j++){
                System.out.print("\t");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i=r;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            int spaces=2*(r-i);
            for(int j=1;j<=spaces;j++){
                System.out.print("\t");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
