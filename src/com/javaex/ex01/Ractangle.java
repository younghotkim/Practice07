package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	public void showInfo(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
		
	public void draw() {
		System.out.println("[사각형]#면색:" + fillColor + "#가로:" + width + "#세로:" + height + "그렸습니다.");
		System.out.println("sr1의 가로는" + width +"입니다.");
	}
	//자식클래스가 상속을 받고있는 추상메소드가 갖고있는 동일한 이름의 메소드를 생성해준다(오버라이딩)
	
}


