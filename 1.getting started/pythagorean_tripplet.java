import java.util.*;
  
  public class pythagorean_tripplet{
  
  public static void main(String[] args) {
 
    
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    
    if(a>c)
        {
            a=a+c;
            c=a-c;
            a=a-c;
        }
    if(b>c)
        {
            b=b+c;
            c=b-c;
            b=b-c;
        }
    
    a = (int)Math.pow(a,2);
    b = (int)Math.pow(b,2);
    c = (int)Math.pow(c,2);

    if( c == a + b )
        {
            System.out.println("true");
        }
    else 
        {
            System.out.println("false");
        }
    
 
}}