import java.util.Scanner;
class Main { 
  public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);  
       int size = sc.nextInt();
       int arr[] = new int[size];
       for(int index = 0; index < size; index++)
       {
           arr[index] = sc.nextInt();
       }             
        int n = arr.length;   
        System.out.println(getMaxLength(arr, n)); 
    }
    static int getMaxLength(int arr[], int n) 
    { 
        int count = 0; 
        int result = 0; 
        for (int i = 0; i < n; i++) 
        { 
            if (arr[i] == 0) 
                count = 0;
            else
            { 
                count++;
                result = Math.max(result, count); 
            } 
        } 
        return result; 
    } 
     
}
