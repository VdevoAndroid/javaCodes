package javaBasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfeachElement {
	public static void main(String[] args) {
	
		int arr[]= {1,1,2,3,5,4,4,6};
		
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) { //for checking element available in hashmap or not
				hm.put(arr[i], hm.get(arr[i])+1);//arr same element and value increase for frequency
				
				}
			else {
				hm.put(arr[i], 1);//take same element present in array and frequency should be 1 it will added into the hashmap
				}
			
		}
		
		for (Map.Entry entry:hm.entrySet()) {
			System.out.println("Element | Frequency");
			System.out.println("   "+entry.getKey()+"          "+entry.getValue());
			
		}

	}
}
