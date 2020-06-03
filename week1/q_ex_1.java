import java.util.*;

class q_ex_1 {

    public static boolean isArmstrong(int a){
        boolean status=false;
        int res1 =a;
        int arm=0;
        while(a>0){
                int p =a%10;
                arm=arm+Math.pow(p,3);
                a=a/10;
        }
        if(res1==arm){
            status=true;
        }
        else{
            status=false;
        }
        return status;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(Sytem.in);
        int a =sc.nextInt();
        if(isArmstrong(a)){
            System.out.println("It is armstrong");
            
        }
        else{
            System.out.println("It is not armstrong");
        }
    }
}