import java.util.*;
public class primefact
{
 public static void main(String[] args) 
 {
 
    Scanner sc = new Scanner(System.in); 
  int n = sc.nextInt();
  int fac = 2;
  while(n!=1) {
      while(n%fac==0) {
          n = n/fac;
          System.out.print(fac + " ");
      } 
          fac = fac+1;
  }
    
}}  