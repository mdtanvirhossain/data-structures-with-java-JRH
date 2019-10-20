package pp.dswj.chapter2.arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
		print(a);
		
		System.out.println("search(a, 44): "+ search(a, 44));
		System.out.println("search(a, 50): "+ search(a, 50));
		System.out.println("search(a, 77): "+ search(a, 77));
		System.out.println("search(a, 100): "+ search(a, 100));

	}
	
	public static int search(int[] a, int x) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				return i;
			}
		}
		
		return -1; //means element not found
	}
	
	public static void print(int[] a) {
		System.out.printf("{%d", a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.printf(", %d", a[i]);
		}
		System.out.println("}");
	}

}
