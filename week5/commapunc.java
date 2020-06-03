import java.util.*;
class commapunc{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i,c=0;
		String str ,s=" ",s1=" ";
		System.out.println("Enter a number : \n");
		str=sc.nextLine();
		for(i=str.length()-1;i>=0;i--)
		{
			c++;
			s=s+str.charAt(i);
			if(c%3==0)
			{
				s=s+" ,";
			}
			for(i=s.length()-1;i>=0;i--)
			{
				s1=s1+s.charAt(i);
			}
			System.out.println("Output String : \n"+str);
		}
	}
}