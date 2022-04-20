package com.javaex.ex05;

public class Ex05 {
	public static void main(String[] args) {
		//같은new[]
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = arrA; //주소 복사(같은 주소)
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("==========================");
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("==========================");
		
		System.out.println("arrA[1] 번째 값 변경");
		arrA[1] = 100;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}

}
