import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int size = in.nextInt();
       int arr[] = new int[size];
       for(int index = 0; index < size; index++){
           arr[index] = in.nextInt();
       }
       // Function call
       zeroes_at_the_end(size, arr);
       for(int index = 0; index < size; index++){
           System.out.print(arr[index] + " ");
       }
    }
    public static void zeroes_at_the_end(int size, int arr[])
    {
        
        int count = 0;
        for(int index = 0; index < size; index++){
            if(arr[index] != 0)
            {
                int temp = arr[index];
                arr[index] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}