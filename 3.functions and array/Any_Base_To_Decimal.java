import java.util.*;

public class Any_Base_To_Decimal
{

public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int b = scn.nextInt();
int d = getValueIndecimal(n, b);
System.out.println(d);
}

public static int getValueIndecimal(int n, int b){
int f = 0;
int i = 1;
while(n!=0)
{
f = f + ( (n % 10) * i );
n = n / 10;
i = i * b;
}

return f;
}
}