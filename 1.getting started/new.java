import java.util.*;
public class new
{
 public static void main(String[] args) 
 {
 
 
      Scanner sc = new Scanner(System.in); 
      int n = sc.nextInt();
      int fac = 2;
      while(n!=1) {
          if(n%fac==0) {
              n = n/fac;
              System.out.println(fac);
          } 
  
              fac = fac+1;
        }
  
   
   
}}  