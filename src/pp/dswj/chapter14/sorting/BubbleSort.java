package pp.dswj.chapter14.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] a = {13, 7, 6, 45, 21, 9, 101, 102};
		sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
	
	//bubble sort
	public static void sort(int[] a) {
		for (int i = a.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j]  > a[j+1]) {
					swap(a, j, j+1);
				}
			}
		}
	}
	
	//swap
	public static void swap(int[] a, int i, int j) {
		if (i == j) {
			return;
		}
		
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

}
