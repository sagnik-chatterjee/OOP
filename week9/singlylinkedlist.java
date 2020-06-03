
import java.util.*;

class Node<T> {
	
	T data;
	Node<T> next;

	public Node (T data) {
		this.data = data;
		this.next = null;
	}

	public String toStr() {
		return data.toString();
	}

}

class List<T> {

	Node<T> head;

	public void insert (T data) {
		Node<T> temp = new Node<T>(data);
		if (head == null)
			head = temp;
		else {
			temp.next = head;
			head = temp;
		}
	}


	public T delete () {
		if (head == null)
			return null;
		T data = head.data;
		head = head.next;
        return data;
    }     
       
	public String toStr() {
		String str = "\t";
		Node<T> temp = head;
		while (temp.next != null) {
			str += temp.data + " -> ";
			temp = temp.next;
		}
		str += temp.data;
		return str;
	}
	
}

public class singlylinkedlist<T> {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);

		List<Integer> integerList = new List<>();
		List<Double> doubleList = new List<>();

		int lch = 0;
		do {
			System.out.printf("\n\t1. Integer List\n\t2. Double List\n\tChoice: ");
			lch = sc.nextInt();

			int ch;
			do {
				System.out.printf("\n\t1. Insert \n\t2. Delete \n\t3. Display\n\tChoice: ");
				ch = sc.nextInt();

				if (ch == 1) {
					System.out.printf("\n\tEnter item to be inserted: ");
					if (lch == 1)
						integerList.insert(sc.nextInt());
					else if (lch == 2)
						doubleList.insert(sc.nextDouble());
				}
						
				else if (ch == 2) {
					Object item = null;
					if (lch == 1)
						item = integerList.delete();
					else if (lch == 2)
						item = doubleList.delete();
					System.out.println("\n\tDeleted item: " + item);
				}

				if (lch == 1)
					System.out.println("\n\tInteger list: " + integerList.toStr());
				else if (lch == 2)
					System.out.println("\n\tDouble list: " + doubleList.toStr());
				
			} while (ch >= 1 && ch <= 3);

		} while (lch >= 1 && lch <= 2);

	}

}