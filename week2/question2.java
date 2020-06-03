//insert and delete an element in an array given its input 

import java.util.*;

class question2{
     static int deleteElement(int arr[], int n, int x) 
    { 
        // If x is last element, nothing to do 
        if (arr[n-1] == x) 
            return (n-1); 
  
        // Start from rightmost element and keep moving 
        // elements one position ahead. 
        int prev = arr[n-1], i; 
        for (i=n-2; i>=0 && arr[i]!=x; i--) 
        { 
            int curr = arr[i]; 
            arr[i] = prev; 
            prev = curr; 
        } 
  
        // If element was not found 
        if (i < 0) 
            return 0; 
  
        // Else move the next element in place of x 
        arr[i] = prev; 
  
        return (n-1); 
    } 
s    public static void main(String[] args){
        Scanner sc =new Sanner(System.in);
        int arr_size= sc.nextInt();
        int arr[] =new int[arr_size];

        //now enter the elements of the array 
        for(int i=0;i<arr_size;i++){
            arr[i]=sc.nextInt();
        }
        int value=sc.nextInt();//the lement that we want to insert 
        int posn =sc.nextInt();//the posn at which we want to add --> 0<=posn<=arr_size

        arr[posn]=value;

        //enter the posn from which to delete the value of the array 
        int posn1=sc.nextInt();

        System.out.println(deleteElement(arr,posn1,arr[i]));
    }
}