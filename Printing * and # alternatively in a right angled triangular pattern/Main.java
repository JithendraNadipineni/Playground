import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
        int m = 0;
        for(int row_no =1 ; row_no <= n ; row_no++) {
            for(int col_no =1 ; col_no <= row_no ; col_no++) {
                if(m == 0) {
                    System.out.print("*");
                    m = 1;
                }
                else {
                    System.out.print("#");
                    m = 0;
                }
     
            }
            System.out.print("\n");
        }
       
    }
}