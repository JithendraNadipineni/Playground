import java.util.Scanner;
public class Main  {
   public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
       int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++)  {
            arr[i] = s.nextInt(); 
           }
     int k_size = s.nextInt();
        for (int i = 0; i < size; i++)  {
            for (int j = i + 1; j < size; j++)  {
                if (arr[i] < arr[j]) 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.print(arr[k_size-1]);
    }
}