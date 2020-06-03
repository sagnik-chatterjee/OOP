//method to find sum of digits of number

import java.util.*;


class q_ex_2{
    public static int sum(int a){
        int sum=0;
        while(a>0){
            int p=a%10;
            sum=sum+p;
            a=a/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println(sum(a));
    }
}