import java.util.*;
  
  public class is_no_prime{
  
  public static void main(String[] args) 
  {
      Scanner scn = new Scanner(System.in);
      
       int t =scn.nextInt();
       for (int i = 0; i<t ; i=i+1 )
           {
               int n = scn.nextInt();
               int count =0;
               for ( int k = 2; k<n-1; k=k+1)
                   {
                      if (n%k==0)
                         {
                            count = count+1;
                         }
              }
               if (count ==0)
                  {
                     System.out.println("prime");
                  }
               else 
                  {
                     System.out.println("not prime");
                  }
                  
           }
  } }
  