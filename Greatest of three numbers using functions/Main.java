import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int n3 = in.nextInt();
    System.out.println(gcd_of_2numbers(n1,n2,n3));
}
  public static int gcd_of_2numbers(int n1,int n2,int n3)
  {
    int min_value;
    if(n1>n2)
    {
     min_value=n1;
    }
    else if(n2>n1)
    {
     min_value=n2; 
    }
    else if(n2>n3)
    {
    min_value=n2;
    }
    else
    {
     min_value = n3; 
    }
   int gcd=min_value;
    return gcd;
}
}