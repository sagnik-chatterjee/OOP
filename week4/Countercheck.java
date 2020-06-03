import java.util.*;

class Counter{

	static int count=0;
	Counter(int i)
	{
		count++
	}
}
class CounterCheck{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		SYstem.out.println("Enter the no of objects to be pushed \n");
		int n =sc.nextInt(); 
		for(int i=0;i<n;i++)
		{
			Counter s =new Counter(i);
			System.out.println("One more object created \n"+i);

		}
		System.out.println("The total no of objects created are \n");
		System.out.println(counter.count);
	}
}