import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
int a=in.nextInt() , reverse;
int firstdigit=a/100;
    int seconddigit=(a/10)%10;
    int thirddigit=a%10;
    reverse=(thirddigit*100)+(seconddigit*10)+(firstdigit);
System.out.println(reverse);
  }
}