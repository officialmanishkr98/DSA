import java.util.*;

public class main {

    public static void main(String[] args){

        // Scanner scn = new Scanner(System.in);
        String str = "Hello"; //declaring and initializing a string name str which contains "Hello"
        System.out.println(str);    //printing the value of str
        System.out.println(str.length());   //printing the length of string

        for(int i=0; i<str.length(); i++)   //applying the loop as we applied on array for printing the string letter by letter 
        {
            System.out.println(str.charAt(i)); //we have to use str.charAt(index.of.string) for finding out the value at that index
        }

        



}}