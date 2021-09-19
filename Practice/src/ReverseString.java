

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "I LOVE INDIA ";
	
		//$$$$$$$$
//		char[] arr =input.toCharArray();
//		
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr [i]);
//		}
		
		//$$$$$$$$
//		 StringBuffer sbr = new StringBuffer(input);//java.io.*;  java.util.*;  java.lang.*;
//	        // To reverse the string
//	        sbr.reverse();
//	        System.out.println(sbr);
		
		
		//$$$$$$$$
		 StringBuilder sb = new StringBuilder(input);//java.io.*;  java.util.*;  java.lang.*;
	        // To reverse the string
	        sb.reverse();
	        System.out.println(sb);

	}
}
