import java.util.*;
public class day6{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=5-i+1;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}