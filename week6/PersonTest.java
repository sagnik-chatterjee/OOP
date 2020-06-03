
import java.util.*;
import java.text.*; //for the simple date format -- using java.test.SimpleDateFormat

 class Person {

	private String name;
	private GregorianCalendar dob;

	public Person () {
		name = "";
		dob = new GregorianCalendar ();
	}
	
	public void setName (String n) {
		name = n;
	}
	
	public void setDOB (GregorianCalendar dob) {
		this.dob = dob;
	}

	public String getName () {
		return name;
	}

	public GregorianCalendar getDOB ()  {
		return dob;
	}
	
	public void inputFields () {
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Enter name: ");
		name = sc.nextLine ();
		
		System.out.print ("Enter dob (yyyy/mm/dd): ");
		dob = new GregorianCalendar (sc.nextInt(), sc.nextInt() - 1, sc.nextInt());
	}
	
	public void display () {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
		System.out.println ("\n\nName: " + name + "\nDOB: " + dateFormat.format(dob.getTime()));
	}
	
}
 class CollegeGraduate extends Person {
	
	private double gpa;
	private int yearGraduated;

	public CollegeGraduate () {
		super ();
		gpa = 0.0;
		yearGraduated = 0;
	}
	
	public double getGPA () {
		return gpa ;
	}
	
	public int getYearOfGraduation () {
		return yearGraduated;
	}
	
	public void inputFields () {
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Enter name: ");
		setName (sc.nextLine ());
		
		System.out.print ("Enter dob (yyyy/mm/dd): ");
		GregorianCalendar db = new GregorianCalendar (sc.nextInt(), sc.nextInt() - 1, sc.nextInt());
		setDOB (db);
		
		System.out.print ("Enter gpa: ");
		gpa = sc.nextDouble ();
		
		System.out.print ("Enter year of graduation: ");
		yearGraduated = sc.nextInt();
	}
	
	public void display () {
		super.display ();
		System.out.println ("GPA: " + gpa + "\nYear of Graduation: " + yearGraduated);
	}
}
public class PersonTest {
	
	public static void main (String [] args) {
		
		  //for the first class 
			Person person = new Person ();
			person.inputFields ();
			person.display ();
		 
		 //for the subclass extension
		    CollegeGraduate cg = new CollegeGraduate ();
			cg.inputFields ();
			cg.display ();
	
			System.exit (0);
		

	}
}



