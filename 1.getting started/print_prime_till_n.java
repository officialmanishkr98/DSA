import java.util.*;

public class print_prime_till_n{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        // for(int i=low;i<=high;i++)
        //     {
        //         int cntr=0;
        //         for(int j=2;j*j<=i;j++)
        //             {
        //                 if(i%j==0){cntr++; break;}
        //             }
        //         if(cntr==0){System.out.println(i);}
        //     }
        
        while(low<=high)
            {
                int i=2;
                int c = 0;
                
                while(i*i<=low)
                    {
                        if(low%i==0){ c++;break;}
                        i++;
                    }
                if(c==0){System.out.println(low);}
                
                low++;
            }
        
    }
}