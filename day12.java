public class day12 {
    public static void main(String[] args){
        int s=5,h=65,v=65;
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(i==s/2){
                    System.out.print((char)(h+j));
                }
                else{ 
                    if(j==s/2){
                        System.out.print((char)(v+i));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            if(i==s/2){
                    v++;
                }
                System.out.println();
        }
    }
}
