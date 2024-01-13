public class array {
    public static void update(int marks[]){
         for(int i=0; i<marks.length; i++){
            marks[i]+=1;
        }

    }
    public static void main(String args[]){
        int marks[]={10,20,30};
        System.out.println();
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]);
                    System.out.print(" ");
        }
        System.out.println();
System.out.println();
System.out.println("after update");
System.out.println();
 update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]);
            System.out.print(" ");
        }
        
System.out.println();
System.out.println();
    }
    
}
