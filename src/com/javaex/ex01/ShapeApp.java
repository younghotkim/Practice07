package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape s = new Shape("빨강");
		//추상 메소드는 스스로 객체 생성이 불가능하다.
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 12, 4);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		
		
		
	}
}

	
	