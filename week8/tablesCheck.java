import java.util.*;

class Table {
	
	public static  void printTable (int n, int k)  {
		for (int i = 1; i <= k; ++i) {
			System.out.printf("\t%4d x %d\t= %4d\n", n, i, n*i);
			
			if (i == k)
				System.out.println();
		}
	}

}

class TableThread extends Thread {

	Table table;
	int n;
	int k;
	
	public TableThread (String threadName,int n,int k,Table table) {//constructor for it 
		super(threadName);
		this.n = n;
		this.k = k;
		this.table = table;
		start(); // this is for starting the thread
	}

	
	public void run () {
		
			Table.printTable(n, k);
		
	}

}

class tablesCheck {

	public static void main (String [] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t Tables of what number to be printed ?? ");
		int l = sc.nextInt();
		int arr[] = new int[l];
		
		System.out.print("\t Enter the elements  that are required to be printed: ");
		for (int i = 0; i < l; ++i)
			arr[i] = sc.nextInt();
			
		System.out.print("\t Enter the table limit till which it is to be printed: ");
		int k = sc.nextInt();
		
		System.out.println();
		
		Table table = new Table();
		
		TableThread tableThreads[] = new TableThread[l]; // creating an array of objects of the class
		
		for (int i = 0; i < l; ++i)
			tableThreads[i] = new TableThread("Thread"+arr[i], arr[i], k, table);

	}

}
