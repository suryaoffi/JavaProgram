package practice_test;

import java.io.FileInputStream;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		Test1 test = new Test1();
		//test.removeDubSet();
		test.firstLetterCaps();
	}
	
	public void removeDubSet() {
		int [] dub = {12,12,65,8};
		Set<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<dub.length;i++) {
			set.add(dub[i]);
		}
		System.out.println(set);
		
	}
	
	public void revWord() {
		String s = "surya jayakumar";
		String []arr = s.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
	}
	
	public void removeSpeciual() {
		String s = "Surya#^ *&UI";
		String onlyString = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
		
		if(Character.isLetterOrDigit(ch)) {
			onlyString+=ch;			
		}
		}
		System.out.println(onlyString);
		
				
			
	}
	
	public void arrayConc() {
		
		int [] ar= {10,20,40,50,15};
		int two = ar[1];
		int three = ar[2];
		ar[1]=three;
		ar[2]=two;
		for(int i:ar) {
			System.out.println(i);
		}
		
		
//		int[] arr = {1,2,4,4,4,5,5,6,6};
//		for(int i=0; i<arr.length; i++) {
//			int count= 1;
//			int temp=0;
//			for(int j=i+1;j<arr.length;j++) {			
//				if(arr[i]==arr[j]) {					
//					count++;
//					arr[j]=temp;
//				}				
//			}
//			   if (count == 2 && arr[i]!=0) {
//	                System.out.println(arr[i]);         
//		      }
//	}

	}
	
	public void firstLetterCaps() {
		String s = "SURYA IS WAS";
		char[] ch = s.toCharArray();
		//boolean second = true;
		for (int i = 0; i < s.length(); i++) {
			//if (second) {
			if(i!=0) {
				 if (ch[i] == ' ') {
					 i+=2;
				}
				if (Character.isLetter(ch[i])) {
					ch[i] = Character.toLowerCase(ch[i]);
					//second = false;
				}
			}

			//} else {
				//second = true;
			//}

		}
		s = String.valueOf(ch);
		String s1 = String.valueOf(ch);
		System.out.println(s);

	}
}
