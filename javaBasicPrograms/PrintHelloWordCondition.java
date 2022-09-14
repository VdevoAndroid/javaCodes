package javaBasicPrograms;

public class PrintHelloWordCondition {
	
	public static void main(String[] args) {
		int num=14;
		if(num%5==0 && num%7==0) {
			System.out.println("Hello World");
		}
		else if (num%5==0) {
			System.out.println("Hello");
		}
		else if (num%7==0) {
			System.out.println("World");
		}
	}

}
