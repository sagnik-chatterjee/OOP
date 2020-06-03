import java.util.*;
import java.lang.System;
class question1{
    
    int a,b,c;
    question1(int a ,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

   public  int largest(int a,int b,int c)
    {
        int flag=a;
        if(a>b && a>c)
        {
            flag =a;
        }
        if(b>a && b>c)
        {
            flag =b;
        }
        if (c>a && c>b)
        {
            flag =c;
        }
        return flag;

    }

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the three numbers \n");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        question1 p = new question1(a,b,c);
        int h =p.largest(a, b, c);
            System.out.println(h+"\tis the largest.\n");
            sc.close();
    }
}