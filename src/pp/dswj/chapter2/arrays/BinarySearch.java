package pp.dswj.chapter2.arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
		print(a);
		
		System.out.println("search(a, 44): "+ search(a, 44));
		System.out.println("search(a, 50): "+ search(a, 50));
		System.out.println("search(a, 77): "+ search(a, 77));
		System.out.println("search(a, 100): "+ search(a, 100));

	}

	//binary search function
	public static int search(int[] a, int x) {
		int lo = 0; //first index
		int hi = a.length; //array length
		
		while(lo < hi) {
			int i = (lo + hi)/2; //find out the mid-point
			if(a[i] == x) {
				return i;
			}
			else if (a[i] < x) {
				lo = i + 1;
			}
			else {
				hi =  i;
			}
		}
		//if not found
		return -1;
	}
	
	//print array
	public static void print(int[] a) {
		System.out.printf("{%d", a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.printf(", %d", a[i]);
		}
		System.out.println("}");
	}
}
