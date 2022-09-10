public class day17{
    public static void main(String[] args){
        int s=5,a=65;
        for(int i=0;i<s;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*(s-i)-1;k++){
                if(i==0||i==s-1){
                    System.out.print((char)(a+k));
                }
                else{
                    if(k==0||k==2*(s-i-1)){
                    System.out.print((char)(a+k));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}