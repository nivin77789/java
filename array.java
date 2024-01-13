public class array {
    public static int update(String marks[],String key){
         for(int i=0; i<marks.length; i++){
           if(marks[i]==key){
            return i;
           }
        }
        return -1;

    }
    public static void main(String args[]){
        String marks[]={"idli","dosa","chutny","biriyani","kabab","masala","tea"};
      String key="biriyani";
 int index=update(marks , key);
       
 if(index==-1){
System.out.println("NOT FOUND");
 } else {
    System.out.println("item foud at position : " +marks[index]);
 }
        

    }
    
}
