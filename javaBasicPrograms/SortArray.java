package javaBasicPrograms;

import java.util.Arrays;

public class SortArray {
 

	public static void main(String[] args) {
		//integer sorting using Arrays.sort();
		int arr[]= {22,14,52,44,75,41,89,102,06,05};
		Arrays.sort(arr);
		System.out.println();
		System.out.println("sorted integer arrys are: ");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//String sorting using Arrays.sort();
		String str[]= {"Zeba","Shankar","Rahul","Jay","Abhishek"};
		Arrays.sort(str);
		System.out.println();
		System.out.println("Sorted String array are: ");
		for (int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
	}
}
