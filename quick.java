import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
   
    public static int pivotplace(int num[],int start,int end){
        int pivot=num[start];
        int isSmall=start;
        int isGreat=end;
        // System.out.println(isSmall+" "+isGreat);
        int temp;
        while(true){
            while(num[isSmall]<=pivot){
                isSmall++;
            }
            while(num[isGreat]>=pivot){
                isGreat--;
            }
            if(isSmall<isGreat){
                temp=num[isSmall];
                num[isSmall]=num[isGreat];
                num[isGreat]=temp;
            }
            else{
                break;
            }
        }
        
        num[start]=num[isGreat];
        num[isGreat]=pivot;
    return isGreat;
    }
    public static void quick(int arr[],int s,int e){
        if(s<e){
            int p=pivotplace(arr,s,e);
            quick(arr,s,p-1);
            quick(arr,p+1,e);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,2,9,5,7,1};
        quick(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);        
        }
    
    }
}
