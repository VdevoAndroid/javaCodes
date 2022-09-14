package javaBasicPrograms;

public class MaxMinElementArray {
	public static void main(String[] args) {
        int arr[] ={25, 11, 7, 75, 56}; //Initialize array  
        int max = arr[0];     //Initialize max with first element of array.   
        for (int i = 0; i < arr.length; i++) {          //Loop through the array  
           if(arr[i] > max)  //Compare elements of array with max  
               max = arr[i];  //if array index greater than max then max should be array element
        }  
        System.out.println("Largest element present in given array: " + max); 
        
        int min = arr[0];     //Initialize max with first element of array.   
        for (int i = 0; i < arr.length; i++) {          //Loop through the array  
            if(arr[i] < min)  //Compare elements of array with max  
            	min = arr[i];  //if array index greater than max then max should be array element
         }  
         System.out.println("smallest element present in given array: " + min);  
	}
}
