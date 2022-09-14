
package javaBasicPrograms;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("1 tp 100 even number");
		for (int i=1;i<=100;i++) {  //print 1 t0 100 even number
			if(i%2==0) {
				
				System.out.println(i);
			}
		}
		System.out.println("1 tp 100 odd number");
		for (int i=1;i<=100;i++) {  //print 1 t0 100 odd number
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
		
}
