//finding roots using switch case stmt

import java.util.*;

public class quetison2{
    public static double[] findRoots(int a ,int b ,int c){
       int k =Math.sqrt(Math.pow(b,2)-4*a*c);
       double arr[] =new double[2];
       double soln1 = (-1*b + k)/2*a;
       double soln2 =(-1*b-k)/2*a;
       arr[0]=soln1;
       arr[1]=soln2;
       return arr;
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c =sc.nextInt();

        double v[] =new double[2];
        v= findRoots(a,b,c);
        for(int i=0;i<2;i++){
            System.out.println(v[i]);
        }
    }
}