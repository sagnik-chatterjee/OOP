//factorial of agiven number 


import java.util.*;


class question2 extends Exception{
    
    int num;
    question2(int num)
    {
        this.num=num;
    }

    int factorial(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else if(num==1)
        {
            return 1;
        }
        else {
            return (num*factorial(num-1));
        }
    }
    public static void main(String[] args) {
        try{
        Scanner sc =new Scanner(System.in);
        System.out.println("ENter the number for the factorial: \n");
        int a =sc.nextInt();
            question2 p =new question2(a);

            int h =p.factorial(a);
            System.out.println(" The factorial of the number is :"+h+"\n");
                System.out.println("ENter the value of r:\n");
                int b =sc.nextInt();

                question2 q =new question2(b);
                int o =q.factorial(b);
                int k =q.factorial(a-b);

                int result = h/(o*(k));
                System.out.println("The combination result is : \n "+result);
            sc.close();    


    }
    catch(Exception e)
    {
        System.out.println(e.getStackTrace());
    }
}
}