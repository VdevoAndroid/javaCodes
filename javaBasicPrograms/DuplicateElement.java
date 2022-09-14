package javaBasicPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		int a[]= {4,5,4,7,4,5};
		System.out.println("Duplicate elements are : ");
		
		//Brute force element
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if((a[i]==a[j]) && (i!=j)) {
//					System.out.println(a[j]);
//				}
//			}
//		}//it will not be perfect way for finding duplicate element disadvantage are of this it take same element when the element comes after the coming array if the continously printing same element then it is right program  2, it takes more times for execution
	
	//by using SET interface
		
//		Set<Integer> s=new HashSet<>();
//		for (int num : a) {
//			if(s.add(num)==false) {
//				System.out.println(num);
//			}
//		}//if the element repeat more than twice it will print again that element disadvantage
	
		
		Map<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for (int num : a) {
			
			Integer count = hm.get(num);
			if (count==null) {
				hm.put(num, 1);
			}
			else {
				count=count+1;
				hm.put(num, count);
			}
		}
		
		
		
	}
}
