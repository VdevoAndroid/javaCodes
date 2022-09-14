package javaBasicPrograms;

import java.util.HashSet;
import java.util.Set;

public class VowelsCounts {
	public static void main(String[] args) {
		VowelsCounts.vowelFun();
	}
	
	//Method
	private static void vowelFun() {
		int count=0;
		String str="i am a engineer";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||
					str.charAt(i)=='o' ||str.charAt(i)=='u') {//You can Add Capital Vowel Also
				System.out.println("in the given string vowel is "+str.charAt(i));
//				Set< Character> set=new HashSet<Character>(str.charAt(i));
//				set.add(str.charAt(i));
//				System.out.println("vowels is in the given string is");
				
				count++;
			}
		}
		System.out.println("Count is "+count);
	}
 }
