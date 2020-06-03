import java.util.*;
class Complex{

int real;
int imag;
public Complex()
{//default constructor 
	real=0;
    imag=0; 
}
public Complex(int real ,int imag)
{
	//parameterized constructor
this.real=real;
this.imag=imag;

}
public void display()
{
      if(imag >0)
      {
      	System.out.println(real+"+"+imag);
      }
      else
      {
      	System.out.println(real+"-"+Math.abs(imag));
      }

}
public Complex add(Complex a ,Complex b)
{
	Complex add_temp =new Complex(0,0);
    add_temp.real=a.real+b.real;
    add_temp.imag=a.imag+b.imag;
    return add_temp;
}
 public Complex subtract(Complex a ,Complex b)
 {
 	Complex sub_temp=new Complex(0,0);
 	sub_temp.real=a.real-b.real;
     sub_temp.imag=a.imag-b.imag;
     return sub_temp;
 } 

}


class ComplexTest{
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter real part of the two nos \n ");
	int re1 =sc.nextInt();
	int re2 =sc.nextInt();

System.out.println("ENter imaginary part of the two nos \n");
int im1=sc.nextInt();
int im2=sc.nextInt();

Complex c0 =new Complex();
Complex c1 =new Complex(re1,im1);
Complex c2 =new Complex(re2,im2); 

c0.display();
c1.display();
c2.display();


Complex c3= new Complex(0,0);
Complex c4 =new COmplex(0,0);

c3.add(c1,c2);
c4.subtract(c1,c2);

System.out.println("Sum of the two complex numbers \n");
c3.display();
System.out.println("Diff of the two complex numbers \n");
c4.display();

   }
}

























}
}