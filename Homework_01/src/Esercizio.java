
public class Esercizio {

	public static int sumPos(int[] a) {
		int sum = 0;
		for (int i : a) {
			if (i >= 0) {
				sum += a[i];
			}
		}
		return sum;
	}

	public static int sumOdd(int n) {
		int s = 0;
		for (int i = 0; i < n; i++) {
			s += 1 + i * 2;
		}
		return s;
	}

	public static int average(int b[]) {
		int s = 0;
		for (int i = 0; i < b.length; i++) {
			s += b[i];
		}
		return s / b.length;
	}

	public static int sumRange(int a, int b) {
		int sum = 0;
		if (b < a) {
			int t = b;
			b = a;
			a = t;
		}
		if (a == b)
			return a;
		else {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		a[0] = 5;
		a[1] = 2;
		a[2] = -1;
		int result = sumOdd(6);
		System.out.println(result);
	}
}
