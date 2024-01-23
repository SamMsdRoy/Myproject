import java.util.*;

public class Solution {
   public static void sortArray(int[] nums) {
     int len=nums.length;
     if(len<2){
         return;
     }
     int mid=len/2;
     int[] leftarr=new int[mid];
     int[] rightarr=new int[len-mid];
     for(int i=0;i<mid;i++){
         leftarr[i]=nums[i];
     }
     for(int i=mid;i<len;i++){
         rightarr[i-mid]=nums[i];
     }
      sortArray(leftarr);
      sortArray(rightarr);
      merge(nums,leftarr,rightarr);
      
        }
    public static void merge(int[] nums,int [] leftarr,int[] rightarr){
        int i=0;int j=0;int k=0;
        while(i<leftarr.length && j<rightarr.length){
            if(leftarr[i]>=rightarr[j]){
                nums[k]=rightarr[j];
                j++;
            }
            else{
                nums[k]=leftarr[i];
                i++;
            }
            k++;
        }
        while(i<leftarr.length){
            nums[k]=leftarr[i];
            i++;k++;
        }
        while(j<rightarr.length){
            nums[k]=rightarr[j];
            j++;k++;
        }
    
    }
   
        public static void main(String[] args){
          int[] brr={8,2,4,9,1,5,3,7};
          sortArray(brr);
          for(int i =0;i<brr.length;i++){
          System.out.println(brr[i]);
}
          }
          
}
