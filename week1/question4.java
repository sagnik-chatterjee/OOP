import java.util.*;

class question4{
 int num;
    question3(int num)
    {
        this.num =num;
    }


    int isPrime(int num)
    {
        int flag=0;
        for(int i=2;i<num;i++)
        {
            if (num%i!=0)
            {
                flag=1;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to be checked for prime or not \n");
        int p =sc.nextInt();

        question3 q =new question3(p);
            int y  = q.isPrime(p);


            if(y == 1)
            {
                System.out.println("THe number is Prime \n");
            }
            else {
                System.out.println("The number is not prime \n");
            }
            
    }
}