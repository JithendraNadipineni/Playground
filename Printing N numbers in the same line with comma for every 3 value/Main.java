import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in  = new Scanner(System.in);
	     int n = in.nextInt();
      int m = 3;
	    for(int count = 1; count <=  n; count = count + 1)
	     {
	     System.out.print(count);
          if((count%m==0)&&(count != 0))
          {
            System.out.print(",");
          }
	}
}
}