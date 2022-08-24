import java.util.*;
public class day5{
	public static void main(String[] args) {
        		Scanner s=new Scanner(System.in);
        		System.out.print("Enter the no. of rows:");
       	              int r=s.nextInt();
        		for (int i=1;i<=r;i++){
            			for (int j=1;j<=r-i;j++){
                			System.out.print("\t");
            			}
            			for (int j=1;j<=r;j++){
                			if (i==1 || j==1 || i==r || j==r){
                   				 System.out.print("*\t");
               			 }
               			 else {
                    				System.out.print("\t");
                			}
            			}
            			System.out.println();
        		}
   	 }
}