import java.util.Arrays;
public class Main{
 
  public static void main(String args[]){
    String str1="hello, world, hi ";
    String str2=",";
    
    int count=1;
    String str3[]= con(str1,str2,count);
    for(int i=0;i<str3.length;i++){
      System.out.println(str3[i]+" ");
      
    }

  }
  public static String[] con(String str1,String str2,int count){
    String[] strarray=new String[10];
    int k=0;
    char[] a=new char[100]; 
    String temp="";
    int index=0;
    for(int i=0;i<str1.length();i++){
      if(str1.charAt(i)==','){
        count++;
        temp=substr(index,i,str1); 
        strarray[k]=temp;
        temp="";
        k++;
        index=i+1;
      }
      
      
    }
    temp=substr(index,str1);
      strarray[k]=temp;
      temp="";
      k++;
      System.out.println("count of words "+count);
  return strarray;}

    public static String substr(int k,int i,String str1){
        String tmp="";
        for(int j=k;j<=i;j++){
            tmp+=str1.charAt(j);
        }
    return tmp;}

    public static String substr(int index,String str1){
        String tmp="";
        for(int k=index;k<str1.length()-1;k++){
            tmp+=str1.charAt(k);
        }
    return tmp;}
}
