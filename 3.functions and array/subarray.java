import java.util.*;

public class subarray 
{

  public static void main(String[] args) {
    
    // Scanner scn = new Scanner(System.in);
    int n = 4;

    int [] arr = {10, 20, 30, 40};

    for(int st=0 ; st<n ; st++)
    {
      for(int end=st; end<n ; end++)
      {
        for(int i = st; i<=end ; i++)
        {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }
    }

  }
}