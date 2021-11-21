import java.util.*;
// public class test_2_2   
public class Main
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int st = 2*n-1, sp = 0 ;
    int a = n;


    for(int i = 1; i<= 2*n-1; i++)
    {
        int b = n;

        for(int j=1; j <= sp; j++)
        {
            if(b%2==0) {
                System.out.print(b + " ");

            }
            else
                System.out.print("# ");
            b--;
        }
        for(int j = 1; j<= st; j++) {
               if(a%2==0)
            System.out.print(a + " ");
               else
                   System.out.print("# ");

        }
        for(int j=1; j <= sp; j++)
        {   if((b+1)%2==0) {
            System.out.print(b + 1 + " ");

        }
        else
            System.out.print("# ");
        b++;
        }

        if(i <= n-1)
        {
            sp++;
            st -=2;
            a--;

        }
        else
        {
            sp--;
            a++;
            st += 2;

        }
        System.out.println();
    }


   
   
   
}}  