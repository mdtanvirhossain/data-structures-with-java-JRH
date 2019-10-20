package pp.dswj.chapter2.arrays;

public class ArrayDefs {

	public static void main(String[] args) {
		float x[];
		x = new float[100];
		args = new String[100];
		boolean[] isPrime = new boolean[100];
		int fib[] = {1,2,3,4,5};
		short[][][] b = new short[4][10][5];
		double a[][] = {{1.1,2.2}, {3.3, 4.4}, null};
		a[4] = new double[66];
		a[4][65] = 3.14;
		Object[] objects = {x, args, isPrime, fib, b, a};

	}

}
