import java.util.*;
public class p5
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int sp=n/2;
    int st=1 ;

    for(int i=1; i<=n ; i++)
        {
            // System.out.println(sp +","+ st); //sp=2 & st=1
            for(int j=1;j<=sp;j++){System.out.print("\t");}
            for(int j=1;j<=st;j++){System.out.print("*\t");}
            System.out.println("");

            
            
            if(i<=n/2)
                {
                    sp--; 
                    st=st+2;
                }
            else
                {
                    sp++; 
                    st=st-2;
                }
            
        }

//************************* */

    // Scanner scn = new Scanner(System.in);
        
    //     int n= scn.nextInt();
    //     int nsp=n/2;
    //     int nst=1;
    //     for(int  i=1; i<=n; ++i){
    //         for(int j=1; j<=nsp; ++j){
    //             System.out.print("\t");
    //         }
    //         for(int j=1; j<=nst; ++j){
    //             System.out.print("*\t");
    //         }
    //         if(i<=n/2){
    //             nsp--;
    //             nst=nst+2;
    //         }
    //         else{
    //             nsp++;
    //             nst=nst-2;
    //         }
    //         System.out.println();
    //     }


}}  