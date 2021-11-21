import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     int ans = 0;
     int d = 0 , d2 = 0 , p=1;
     while(n2>0)
     {
         d2 = n2%10;
         n2 /= 10;
         d = getSingleProduct( b , n1 , d2);
         
        //  System.out.println(d);
         
         ans = getSum( b , ans , d*p);
         p *= 10;
     }
     
     return ans;
     
 }


 public static int getSingleProduct(int b, int n1, int d2){
     // write your code here
     int ans = 0;
     int d = 0, d1 = 0 , c=0 , p=1;
     while(n1>0 || c>0)
     {
         d1 = n1 % 10;
         n1 /= 10;
         
         d = d1 * d2 + c;
         c = d / b;
         d = d % b;
         
         ans += d*p;
         p *= 10;
         
     }
     return ans;
     
     
 }
 
 public static int getSum(int b, int n1, int n2){
       
       int ans = 0;
       int p = 1;
       int d1=0,d2=0,c=0, d=0;
       
       while(n1>0 || n2>0 || c>0)
       {
       d1 = n1%10;
       d2 = n2%10;
       n1 /= 10;
       n2 /= 10;
       
       d = (d1 + d2 +c) % b ;
       if( ( d1 + d2 + c ) >= b) { c = 1 ; }
       else{ c = 0 ; }
       
       ans += d*p;
       p *= 10;
       }
       return ans;
       
   }

}