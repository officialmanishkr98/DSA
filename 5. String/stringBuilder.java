import java.util.*;

public class stringBuilder {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        // StringBuilder strb = new StringBuilder("hello");
        StringBuilder strb = new StringBuilder(scn.next());

        //Traversal
        for(int i=0; i<strb.length(); i++)
        {
            System.out.print(strb.charAt(i) + " ");
        }

        System.out.println();

        //Update -> Constant Operation
        strb.setCharAt(3, 'd');
        System.out.println(strb);
        
        //Delete
        strb.deleteCharAt(1);
        System.out.println(strb);
        
        //Insert
        strb.insert(2, 'e');
        System.out.println(strb);
        
        //Append (insert at last) -> Constant Operation
        strb.append('s');
        System.out.println(strb);

        
}}