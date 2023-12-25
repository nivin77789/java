public class pattern {
    
   
    public static void main(String args[]){
       
      pat9(4);
    
}





public static void pat9(int row){
    int star=1;
    for(int i=1; i<=row; i++){
        for(int j=0; j<(row-i); j++){
            System.out.print("   ");
        }
        for(int j=0; j<star; j++){
            System.out.print(" * ");
        }
        star+=2;
    System.out.println();
    }
     for(int i=row; i>=1; i--){
        for(int j=(row-i); j>0; j--){
            System.out.print("   ");
        }
        for(int j=star; j>2; j--){
            System.out.print(" * ");
        }
        star-=2;
    System.out.println();
    }


    /* output
          * 
       *  *  * 
    *  *  *  *  * 
 *  *  *  *  *  *  * 
 *  *  *  *  *  *  * 
    *  *  *  *  * 
       *  *  * 
          * 
     */
}


public static void pat8(int row){
 
    for(int i=0; i<=row; i++){
        for(int j=1; j<=(row-i); j++){
            System.out.print(" ");
        }
            for(int j=1; j<=row; j++){
                  if((j==1)||(j==row)||(i==0)||(i==row)){
            System.out.print("*");
                  } else{
                      System.out.print(" ");
                  }
        }

       
        
    System.out.println();
    }
    


    /* output
    ****
   *  *
  *  *
 *  *
****
     */
}


public static void pat7(int row){
 
    for(int i=0; i<=row; i++){
        for(int j=1; j<=(row-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=row; j++){
            System.out.print("*");
        }
        
    System.out.println();
    }
    


    /* output
    ****
   ****
  ****
 ****
****
     */
}



public static void pat6(int row){

    for(int i=1; i<=row; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
for(int j=1; j<=((row-i)*2); j++){
            System.out.print(" ");
        }

        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        
    System.out.println();
    }
    
for(int i=row; i>=0; i--){
        for(int j=i; j>=1; j--){
            System.out.print("*");
        }
        for(int j=1; j<=((row-i)*2); j++){
            System.out.print(" ");
        }

        for(int j=i; j>=1; j--){
            System.out.print("*");
        }
        
    System.out.println();
    }

    /* output
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
     */
}




public static void pat5(int row){

    for(int i=1; i<=row; i++){
        for(int j=1; j<=i; j++){
             
            if((i+j)%2==0){
                 
            System.out.print("1");
        
            } else {
                System.out.print("0");
            
            }
             
        }

        
    System.out.println();
    }
    


    /* output
      1
01
101
0101
10101
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