package javaBasicPrograms;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};				//integer array
		System.out.print("normal integer array: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Reverse integer array: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}		
		String str[]= {"vijay","bhanu","sagar","rajesh"};  //String array
		System.out.println();
		System.out.print("normal String array: ");
		for(int i=0;i<=str.length-1;i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		System.out.print("reverse string array: ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
		
		
	}

}
