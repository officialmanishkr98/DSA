import java.io.*;
import java.util.*;

public class arrayreverse{
  public static void display(int[] a){

    for(int i = 0; i<a.length; i++)
    {
      System.out.print(a[i] + " ");
    }
  }

  public static void reverse(int[] a){
    // write your code here
    int j = 0;
    int k = a.length-1;
    for(int i = 0; i<a.length/2 ; i++)
    {
        int temp = a[k];
        a[k] = a[j];
        a[j] = temp;
        j++;k--;
    }
  }

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = scn.nextInt();
    }

    reverse(a);
    display(a);
 }

}






// import java.io.*;
// import java.util.*;

// public class arrayreverse {

//     public static void swap(int[] arr , int l , int r)
//     {
//         int temp = 0;
//         int j = l;
//         int k = r;

//         for(int i=0; i<arr.length/2; i++)
//         {
//             temp = arr[k];
//             arr[k] = arr[j];
//             arr[j] = temp;
//             j++;
//             k--;
//         }
//     }

//     public static void display(int[] arr)
//     {
//         for(int i=0; i<arr.length; i++)
//         {
//             System.out.print(arr[i] + " ");
//         }

//     }

//     public static void main(String[] args) {
       
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int [] arr = new int[n];

//         for(int i=0; i<n; i++)
//         {
//             arr[i] = scn.nextInt();
//         }

//         swap(arr , 0 , arr.length-1);

        
//         display(arr);
 
     
//     }
// }