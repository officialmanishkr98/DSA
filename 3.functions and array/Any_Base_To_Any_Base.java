import java.util.*;

public class Any_Base_To_Any_Base
{

public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int n1 = scn.nextInt();
int b1 = scn.nextInt();
int b2 = scn.nextInt();

int n2 = getvalueinb2( n1 , b1 , b2);

System.out.println(n2);

}

public static int getvalueinb2(int n1, int b1 , int b2)
{
int f = 0;
int i1 = 1;
int i2 = 1;
int decimal = 0;

while(n1 != 0)
{
decimal = decimal + ( (n1 % 10) * i1 );
n1 = n1/10;
i1 = i1 * b1;
}

while(decimal != 0)
{
f = f + ( (decimal % b2) * i2 );
decimal = decimal / b2;
i2 = i2 * 10;
}

return f;

}


}