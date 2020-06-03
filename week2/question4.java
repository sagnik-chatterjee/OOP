//adidition of two matrices and dispaly the resultant matrix 

import java.util.*;

class question4{

    public static void main(String[] args){
        Scanner sc =new Scanner(SyStem.in);
        int row_size =sc.nextInt();
        int col_size =sc.nextInt();

        //enter the matrix 1
        int[][] arr1 =new int[row_size][col_size]; 
        for(int i=0;i<row_size;i++){
            for(int j=0;i<col_size;j++){
               arr1[i][j]=sc.nextInt();
            }
        }
        //enter the matrix 2 
        int[][] arr2 =new int[row_size][col_size];
        for(int i=0;i<row_size;i++){
            for(int j=0;j<col_size;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
    
        //additing up them and stroing the reuslt in arr1 
        for(int i=0;i<row_size;i++){
            for(int j=0;j<col_size;j++){
                arr1[i][j]+=arr2[i][j];
            }
        }
        //printing the array 
        for(int i=0;i<row_size;i++){
            for(int j=0;j<col_size;j++){
                System.out.println(arr1[i][j]);
            }
        }
    }
}