import java.util.*;
class bank{
	String name ;
	int acc;
	String type;
	double balance;
	static double roi;

	bank(String name,int acc,String type,double balance)
	{
		System.out.println("Inside the parameterised constructor \n");
		this.name=name;
		this.acc=acc;
		this.type=type;
		this.balance=balance;
	}

	bank()
	{
		System.out.println("Inside the default Constructor \n");
		name="lambda";
		acc=1234;
		type="savings";balance=15.45;
		roi=1.5;
	}

	void depositmoney(double t)
	{
		balance=balance-t;
		System.out.println("Amount deposited \n"+t);
		System.out.println("Balnce now ");
	}
    double withdraw(double n)
    {
    	double give=0;
    	if(balance>=x)
    	{
    		give=x;
    		balance=balance-x;
    	}
    	else
    	{
    		System.out.println("Sorry not possible \n");
    		give=0;
    	}
    }
void display()
{
	System.out.println("Name of the depositor \n"+name);
	System.out.println("Account nUmber \n"+acc);
	System.out.println("TYpe of account \n"+tpe);
	System.out.println("Balance of the account \n"+balance);

	static void statdisplay()
	{
		System.out.println("ROI"+roi);
	}
}
}


class bankaccounttest{
	public static void main(String[] args) {
		bank k =new bank();
		bank m= new bank("Sagnik ",1024,"Savings",180.967);
		k.depositmoney(18000);
		k.depositmoney(9087);
		k.withdraw(900);
		k.withdraw(500);
		k.display();
		m.display();

		k.statdisplay();
		m.statdisplay();
		
	}
}