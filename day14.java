public class day14 {
    public static void   main(String[] args){
        int lines=5,a=65 ,i,j;
        for( i=0;i<lines;i++){
            for( j=0;j<=lines;j++){
                if(i==j || i+j==lines-1){
                    System.out.print((char)(a+j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
