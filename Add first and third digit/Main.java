import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int sum1=(num1/100);
      int sum2=(num1%10);
      int sum=sum1+sum2;
      System.out.println(sum);
	}
}