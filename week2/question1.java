//arrange and sort the elements using bubble sort 
import java.util.*;

class question1{
    public static void bubblesort(int arr[]){
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  
    /* Prints the array */
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
     

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int arr_size =sc.nextInt();
        //now enter the elemnts of the array 
        int[] arr =new int[arr_size];

        for(int i=0;i<arr_size;i++){
            arr[i]=sc.nextInt();
        }
        printArray(bubblesort(arr));

    }
}