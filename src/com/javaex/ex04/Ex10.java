package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				break;//6에서 끝 continue는 6빼고
			}
			System.out.println(i);
		}
		System.out.println("종료");
	}

}
