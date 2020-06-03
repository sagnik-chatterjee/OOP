import java.util.Scanner;

class Matrix {
	private int arr[][];
	
	public Matrix (int n, int m) {
		arr = new int[n][n];
	}

	public int[] getRow (int i) {
		return arr[i];
	}

	public void input () {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t Enter the matrix: ");
		for (int i = 0; i < arr.length; ++i)
			for (int j = 0; j < arr[i].length; ++j)
				arr[i][j] = sc.nextInt();
	}

}

class RowSum implements Runnable {

	private int arr[];
	private int sum;

	RowSum (int a[]) {
		arr = a;
		sum = 0;
	}

	public int getRowSum () {
		return sum;
	}

	public void run () {
		for (int i: arr)
			sum += i;
	}

}

public class matrixTest {

	public static void main (String [] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\n\t Enter the dimensions of the matrix:  \n Enter the  number of rows and the columns \n");
		int n = sc.nextInt();
		int m = sc.nextInt();

		Matrix matrix = new Matrix(n, m);
		matrix.input();

		Thread threads[] = new Thread[n];
		RowSum rowsum[] = new RowSum[n];

		for (int i = 0; i < n; ++i) {
			rowsum[i] = new RowSum(matrix.getRow(i));
			threads[i] = new Thread(rowsum[i]);
			threads[i].start();
		}

		int sum = 0;//total sum of the matrix 
         
         //before the sum  threads we need to join them and to do that we need to put that in a try and cathc block otherwise it will throw error 
		try {
			for (int i = 0; i < n; ++i) {
				threads[i].join();
				sum += rowsum[i].getRowSum();
			}
		}
		catch (InterruptedException e) {
			System.out.println(""+e);
		}
        
       for (int i = 0; i < n; i++)
       {
       	System.out.println("Sum of row :"+i+"\t is : "+rowsum[i].getRowSum());
       } 
		System.out.println("\n\t Total sum = " + sum);

	}

}
