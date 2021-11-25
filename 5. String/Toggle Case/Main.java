import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String ans = "";

        for(int i=0; i<str.length(); i++)
        {
            int x = (str.charAt(i));
            if(x>91)
            {
                x = x-32;
                ans += (char)x;
            }
            else
            {
                x = x+32;
                ans += (char)x; 
            }
        }

        System.out.println(ans);
        



}}