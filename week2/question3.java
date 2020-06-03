//searching an element in 1 d array using linear search

import java.util.*;

class question3{
    static int linearsearch(int arr[] ,int key){
        //returns the index ,if foudn for the key 
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                p=i;
                break;
            }
            else {
                p=-1;
            }
        }
        return p;
        
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int arr_size =sc.nextInt();
        int [] arr =new int[arr_size];

        for(int i=0;i<arr_size;i++){
            arr[i]=sc.nextInt();
        }

        int key =sc.nextInt();//the value to be searched for 
        System.out.println("The"+key+" found at "+linearsearch(arr,key) );
    }
}