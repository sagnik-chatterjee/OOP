import java.util.*;

class Student{
	int regno;
	GregorianCalender doj;
	String name;
	short semester;
	float gpa,cgpa;
     
     Student()  // the default constucctor
     {
     GregorianCalender doj =new GregorianCalender();
     regno=0;
     name="";
     semester=0;
     gpa=0;
     cgpa=0;
     }
     Student(String s,short sem , float g,float c , GregorianCalender d)
     {
     	name =s;
     	date=d;
     	semester=sem;
     	gpa=g;
     	cgpa=c;
     }
void display()
{
	System.out.println("Name: "+name);
	System.out.println("Reg No: "+regno);
	System.out.println("Doj: "+doj.get(Calendar.DATE)+"/"+doj.get(Calendar.MONTH)+"/"+doj.get(Calendar.YEAR));
    System.out.println("Semester :"+semester);
    System.out.println("GPA:"+gpa);
    System.out.println("CGPA:"+cgpa);
    System.out.println();	
}

void semestergpa(Student s[],int n)
{
	Student temp;
	int i,j;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(s[j].semester >s[j+1].semester)
			{
				temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
			else if(s[j].semester==s[j+1].semester && s[j].cgpa >s[j+1].cgpa)
			{
				temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
		}
	}
}

void sortnow(Student s[],int n)
{
	student temp;
	int i,j;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(s[j].name.compareTo(s[j+1].name)>0)
			{
				temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
		}
	}
}

void searchchar(Student s[] ,int n, char ch)
{
	for(int i=0;i<n;i++)
	{
		if(s[i].name.charAt(0)==ch)
		{
			System.out.println(s[i].name);
		}
	}
}
void searchsub(Student s[] ,int n,Sting str)
{
	for(int i=0i<n;i++)
	{
		for(int j=0;j<s[i].name.length()-1;j++)
		{
			for(k=j;k<s[i].name.length();k++)
			{
				if(s[i].name.substring(j,n).equals(str))
				{
					System.out.println(s[i].name);
				}
			}
		}
	}
}

void initialize(Student s[] ,int n)
{
	System.out.println("Initials \n");
	int z=0;
	String p="";
	for(int i=0;i<n;i++)
	{
		p=""+s[i].name.charAt[0];
		for(int j=0;j<s[i].name.length();j++)
		{
			if(s[i].name.charAt[j]==' ')
			{
				z=j+2;
				p=p+"."+s[i].name.substring(z,s[i].name.length());
				System.out.println();
			}
		}
	}
}



class StudentDemo{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n,i,d;
		String name,data,str;
		short semester;
		char  c;
		GregorianCalender g= new GregorianCalender(2019,8,24);
		float gpa,cgpa;
		System.out.println("Enter no of systems: \n");
		n=sc.nextInt();
		Student s[] =new Student[n];
		Student m1= new Student();
		System.out.println("ENter the details of the student: \n");
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the name ,the semester ,gpa,cgpa of student \n"+(i+1)+" \n:");
			name =sc.nextInt();
             semester=(short)sc.nextInt();			
             gpa=sc.nextInt();
             cgpa=sc.nextFloat();

             s[i]=new Student(name,semester,gpa,cgpa);
             d=s[i].doj.get(Calender.YEAR);
             s[i].regno =(d%100)*100+(i+1);
         } 
          m1.semestergpa(s,n);
          m1.name(s,n);
          for(i=0;i<n;i++)
          {
          	s[i].display();
          } 
          System.out.println("Enter characters to add \n");
          c=sc.nextInt().charAt(0);
          m1.searchchar(s,n,0);
          System.out.println("Enter string to search : \n");
          str=sc.next();
         m1.searchchar(s,n,str);
         m1.initial(s,n);


		}
	}
}

}