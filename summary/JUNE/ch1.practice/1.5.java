package test1;

import java.util.Scanner;

public class class1 {
	public static void main(String[] args) {

		double a1 = Double.MAX_VALUE;
		System.out.println(a1);
		
		int a2 = a1;
		System.out.println(a2);
	} 
}

// 아래 에러가 출력된다. 
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	Type mismatch: cannot convert from double to int
