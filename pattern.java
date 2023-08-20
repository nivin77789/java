public class pattern {
    
   
    public static void main(String args[]){
       
      pat5(5);
    
}





public static void pat5(int row){
    boolean iszero=false;
    for(int i=0; i<=row; i++){
        for(int j=1; j<=i; j++){
            if(iszero){
            System.out.print("0");
            iszero=false;
            } else {
                System.out.print("1");
                iszero=true;
            }
            
        }
        iszero=(!iszero);
        
    System.out.println();
    }
    

1
    /* output
       1
       01
       101
       0101
     */
}





public static void pat4(int row){
    int k=1;
    for(int i=0; i<=row; i++){
        for(int j=1; j<=i; j++){
            System.out.print(" "+k++);
        }
        
    System.out.println();
    }
    


    /* output
       1
       23
       456
       78910
     */
}





public static void pat3(int row){
    for(int i=0; i<=row; i++){
        for(int j=1; j<=row-i; j++){
            System.out.print(j);
        }
        
    System.out.println();
    }
    


    /* output
       12345
       1234
       123
       12
       1
     */
}




public static void pat2(int row){
    for(int i=0; i<=row; i++){
        for(int j=0; j<row-i; j++){
            System.out.print("   ");
        }
        for(int j=0; j<i; j++){
            System.out.print(" * ");
        }
    System.out.println();
    }
    


    /* output
               *
             * *
           * * *
         * * * *
     */
}

public static void rectanglestarswithhole(int row, int col){
    

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(j==0 | i==0 | j==col-1 | i==row-1)
                {
                     System.out.print(" * ");
                }
                else 
                {
                     System.out.print("   ");
                }
            }
                System.out.println();
         }
         /* output
    *  *  *  *  * 
    *           * 
    *           * 
    *           * 
    *  *  *  *  *
 */  
     }
    }