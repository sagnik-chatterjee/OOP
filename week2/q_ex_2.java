//finding the trace and norm of  a matrix

import java.util.*;

class q_ex_2{
    static int trace(int[][] arr1){
        int trace_sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                    trace_sum+=arr1[i][i];
            }
        }
        return trace_sum;
    }
    static int norm(int[][] arr1{
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                sum+=Math.pow(arr1[i][j],2);
            }
        }
        return Mth.sqrt(sum);
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
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
        System.out.println("The trace of the matrix is "+trace(arr1));
        System.out.println("The norm of the matrix is "+norm(arr1));

    }
}