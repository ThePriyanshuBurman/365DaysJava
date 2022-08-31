import java.util.Scanner;
public class day9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int r=s.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=r-i;j++){
                System.out.print("\t");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j+"\t");
            }
            for (int j=2;j<=i;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
