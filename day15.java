public class day15{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=3*(4-i+1);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            for(int k=1;k<=3*(4-i+1);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=2;i++){
            for(int k=1;k<=5+i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(9-i+1)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}