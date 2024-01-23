import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
   public static void select(int num[]){
    
    int min=0;
    int temp;
    for(int i=0;i<num.length-1;i++){
      for(int j=i+1;j<num.length;j++){
        if(num[min]>num[j]){
          min=j;
        }
        
      }temp=num[i];

      num[i]=num[min];
      num[min]=temp;
    }
    
     
   }
  
    public static void main(String[] args) {
        int arr[]={8,3,6,2,9,5,7,1};
        select(arr);
        for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);        
        }
    
    }
}
