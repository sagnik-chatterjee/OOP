package p1;

import java.util.*;

public class Max {
	
	int Max (int a, int b, int c) {
		return (a>b)?((a>c)?a:c):((b>c)?b:c);
	}

	float Max (float a, float b, float c) {
		return (a>b)?((a>c)?a:c):((b>c)?b:c);
	}

	int Max (int a[]) {
		int max = 0;
		for (int i : a)
			if (i > max)
				max = i;
		return max;
	}

	int Max(int a[][]) {
		int max = 0;
		for (int b[] : a)
			for (int i : b)
				if (i > max)
					max = i;
		return max;
	}

}
