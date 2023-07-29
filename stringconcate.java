public class Main{  
  public static void main(String args[]){
    String str1="hello world ";
    String str2="HELLO WORLD";
    String str3=con(str1,str2);//str1+=" "+str2 if you want to print
    System.out.println(str3);
  }
  public static String con(String str1,String str2){
    return str1.concat(str2);
  }
}
