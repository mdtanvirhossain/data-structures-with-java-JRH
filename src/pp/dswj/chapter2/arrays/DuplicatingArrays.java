package pp.dswj.chapter2.arrays;

public class DuplicatingArrays {

	public static void main(String[] args) {
		
		int[] a = {22, 44, 66, 88};
		print(a);
		
		int[] b = (int[])a.clone();  //duplicate a[] in b[]
		print(b);
		
		String[] c = {"AB", "CD", "EF"};
		print(c);
		
		String[] d = (String[])c.clone();
		print(d);
		
		c[1] = "XYZ";
		//changing in c but not in d
		print(c);
		print(d);

	}
	
	//for int value
	public static void print(int[] a) {
		System.out.printf("{%d", a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.printf(", %d", a[i]);
		}
		System.out.println("}");
	}
	
	//for string value
	public static void print(Object[] a) {
		System.out.printf("{%s", a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.printf(", %s", a[i]);
		}
		System.out.println("}");
	}

}
