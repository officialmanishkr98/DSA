import java.util.*;

public class subset {

    public static int decimal_to_binary(int n)
    {
        int ans = 0;
        int p = 1;

        int d = 0;
        while(n>0)
        {
            d = n % 2;
            n /= 2;

            ans += d*p;
            p *= 10;
        }
        return ans;
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int n = 8;
        int [] arr = new int [n];

        for(int i=0 ; i<n ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int totalsubsets = (int)Math.pow(2 , n);
        for(int dec = 0 ; dec<totalsubsets ; dec++)
        {
            int binary = decimal_to_binary(dec);
            int power = (int)Math.pow(10 , n-1 );

            for(int i=0 ; i<n ; i++)
            {
                int bit = (binary/power)%10;

                if(bit==1)
                {
                    System.out.print(arr[i] + "\t");
                }
                else
                {
                    System.out.print("-\t");
                }

                power /= 10;

            }
            System.out.println();
        }






}}