import java.util.Scanner;
class Stringmanip
{
  public static void main(String[] args)
 {
    System.out.println("enter the string");
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    System.out.println("length of the string is "+str1.length());
    System.out.println("character at first position ="+str1.charAt(1));
    System.out.println("string contains 'col'sequence:"+str1.contains("Col"));
    System.out.println("string ends with e:"+str1.endsWith("e"));
    System.out.println("replace 'col' with'kol':"+str1.replaceAll("Col","kol"));
    System.out.println("LOWERCASE:"+str1.toLowerCase());
    System.out.println("UPPERCASE:"+str1.toUpperCase());
     sc.close();
  }
}


