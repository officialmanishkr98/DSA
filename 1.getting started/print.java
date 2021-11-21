import java.util.*;
    
    public class print
    {
    
    public static void main(String[] args) 
    {
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        int n=28346751;
        int temp=n;
        int cntr=0;
        
        while(temp>0)
            {
                cntr++;
                temp=temp/10;
            }

        int t=0;
        for(int i=1;i<=cntr;i++)
            {
                int q = n%10;
                int tempo = (int)Math.pow(10,q-1);
                t = t + i*tempo;
                n=n/10;
            }

        System.out.println(t);




    }}
    