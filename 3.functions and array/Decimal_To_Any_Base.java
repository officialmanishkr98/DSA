import java.util.*;

public class Decimal_To_Any_Base
{
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int b = scn.nextInt();
int dn = getValueInBase(n, b);
System.out.println(dn);
}

public static int getValueInBase(int n, int b){

int f=0;
int i=1;
while(n!=0)
{
f = f + ((n % b) * i);
n = n / b;
i = i*10;
}
return f;
}
}