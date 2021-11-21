import java.io.*;
import java.util.*;

public class array{

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []arr = new int[n];
    for (int i = 0; i < n; i++ ) {
      arr[i] = scn.nextInt();
    }
    int totalcols = n;
    int totalrows = maxele(arr);
    for (int i = totalrows ; i >= 1; i--) {
      for (int j = 0; j < totalcols; j++) {
        if (i <arr[j]) {
          System.out.print("*\t");
        } else {
          System.out.print("\t");
        }
	}
	System.out.println("");
    }
  }
  public static int maxele(int []arr) {
    int res = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      res = Math.max(arr[i], res);
    }
    return res;
  }
}
// import java.util.*;

// import javax.swing.plaf.basic.BasicIconFactory;

// public class array {

// 	public static int decimaltobinary(int n)
// 	{
// 		int ans = 0;
// 		int p = 1;

// 		while(n>0)
// 		{
// 			int d = n % 2;
// 			n /= 2;

// 			ans += d*p;
// 			p *= 10;
// 		}

// 		return ans;
// 	}

// 	public static void main(String[] args){

// 	Scanner scn = new Scanner(System.in);
// 	int n = scn.nextInt();
	
// 	int [] arr = new int [n];
	
// 	for(int i=0; i<n; i++){
// 		arr[i] = scn.nextInt();
// 	}

// 	int testcases = (int)Math.pow(2, n);
// 	for(int decimal=0; decimal<testcases; decimal++)
// 	{
// 		int binary = decimaltobinary(decimal);
// 		int divisor = (int)Math.pow(10, n-1);
// 		for(int i=0; i<n; i++)
// 		{
// 			int bit = (binary/divisor);
// 			bit = bit%10;
// 			if(bit==1)
// 			{
// 				System.out.print(arr[i] + "\t");
// 			}
// 			else{
// 				System.out.print("-\t");
// 			}

// 			divisor /= 10;
// 		}

// 		System.out.println();
// 	}


// }}
