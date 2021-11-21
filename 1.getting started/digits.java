import java.util.*;

public class digits {

  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int cntr = 0;
    int temp = n;
    while (temp > 0) {
      n = n / 10;
      cntr++;
    }

    System.out.println(cntr);

    // int div=1;
    // for(int i=1;i<cntr;i++)
    // {
    // div=div*10;
    // }

    // while(n>0)
    // {
    // System.out.println(n%div);
    // n=n%div;
    // div=div/10;
    // }

  }
}