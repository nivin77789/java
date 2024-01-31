public class array{
   
    public static void main(String args[]){
        for(int i=1; i<=4; i++){
            for(int j=1; j<i+2; j++){
                System.out.print(" * ");
            }
            System.out.println();
            
                for(int j=1; j<=(i*2)+1; j++){
                    if(i==4){
                        break;
                    }
                    System.out.println(" * ");
                }            
        }
    }
}
