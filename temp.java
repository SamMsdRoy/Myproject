import java.util.Arrays;
public class Main{
  
  public static void main(String args[]){
    String str1="hello, world, hi ";
    String str2=",";
    
   
    String str3[]= con(str1,str2);
    for(int i=0;i<str3.length;i++){
      System.out.println(str3[i]+" ");
    }
    
  }
  public static String[] con(String str1,String str2){
    String[] strarray=new String[10];
    int k=0;
    char[] a=new char[100]; 
    String temp="";
    for(int i=0;i<str1.length();i++){
      if(str1.charAt(i)==','){
        int v=i;
        for(int j=0;j<v;j++){
          temp+=str1.charAt(j);
        }
        strarray[k]=temp;
        k++;
        temp="";
        continue;
      }
    }
  return strarray;}

}
