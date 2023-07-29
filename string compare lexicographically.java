public class Main{
  public static void main(String args[]){
    String str1="hello world";
    String str2="HELLO WORLD";
	
    int i=str1.compareTo(str2); \\if you use compareToIgnoreCase
    if(i<0){
      System.out.println("greater than str1");
    }
    else if(i==0){
      System.out.println("is equal");
    }
    else{
      System.out.println("less than str1");
    }
  }
}
