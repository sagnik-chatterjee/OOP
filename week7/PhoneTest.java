import java.util.*;

class Phone{
	 public String brand;
	 public int memCapacity;
         Phone(String brand ,int memCapacity)
         {
         	this.brand=brand;
         	this.memCapacity=memCapacity;
         }

	 interface Callable{
            void makeAudioCall(String cellNum );
            void makeVideoCall(String cellNum);
	}

}
 class BasicPhone extends Phone implements Phone.Callable{
     String cellNum;
	BasicPhone(String brand ,int memCapacity, String cellNum )
	{
		super(brand,memCapacity);
		this.cellNum=cellNum;
	}
    void makeAudioCall(String cellNum)
    {
    	System.out.println("Making an audio call to \n"+cellNum);
    }
    void makeVideoCall(String cellNum)
    {
    	System.out.println("Cannot make video call to \n"+cellNum);
    } 
}

 class SmartPhone extends Phone implements Phone.Callable{
	String cellNum;
	SmartPhone(String brand ,int memCapacity, String cellNum )
	{
		super(brand,memCapacity);
		this.cellNum=cellNum;
	}
    void makeAudioCall(String cellNum)
    {
    	System.out.println("Making an audio call to \n"+cellNum);
    }
    void makeVideoCall(String cellNum)
    {
    	System.out.println("Making an  video call to \n"+cellNum);
    }
} 
  
 class PhoneTest{
 	public static void main(String[] args) {
 		Scanner sc =new Scanner(System.in);
         
         System.out.println("Enter your phone brand \n ");
         String brand = sc.nextLine();
         System.out.println("Enter  your memeory capacity \n");
         int memCapacity=sc.nextInt();
         System.out.println("Enter the number for basic phone \n ");
         String no1 =sc.nextLine();
         System.out.println("Enter the number for smart phone \n");
         String no2 =sc.nextLine();
         
         Phone p1 =new Phone(brand,memCapacity); 
         BasicPhone b1 =new BasicPhone(brand,memCapacity,no1);
         SmartPhone s1 =new SmartPhone(brand,memCapacity,no2);

          System.out.println("For the basic phone \n");
           b1.makeAudioCall(no1);
           b1.makeVideoCall(no1);
          
          System.out.println("For the smartphone \n");
           s1.makeAudioCall(no2);
           s1.makeVideoCall(no2);
 	}
 } 


