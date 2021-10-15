package com.yedam.java.ch0204;

import java.io.IOException;
import java.util.Scanner;

public class variableExample {

	public static void main(String[] args) throws IOException {
		//p89 21-10-15
		
		System.out.println("Hello World!");
		System.out.println("Today : 2020.10.15");
		
		System.out.print("Hello World!");
		System.out.print("Today : 2020.10.15");
		
		
		System.out.print("Hello World!\n");
		System.out.print("Today : 2020.10.15\n");
		//  \n 줄바꿈을 뜯하는 문자
	
		System.out.println("=====================");
		
		
	int x =1;
	int y =2;
	System.out.println("x: " + x + ", y: " + y);
	System.out.println("=====================");
	System.out.printf("x: %d, y: %d", x, y);
	
	// p91 %d 변수 값을 뜻하는 위치
	
	
	int value = 123;
	System.out.printf("상품의 가격: %d원\n", value);
	System.out.printf("상품의 가격: %6d원\n", value);
	System.out.printf("상품의 가격: %-6d원\n", value);
	System.out.printf("상품의 가격: %06d원\n", value);
	
	
	//(오류 )double area = 3.14159 * 10 *;
	//System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
	
	
	//뭔말인지 모르겠음
	int keyCode;
	
	keyCode = System.in.read(); //입력할 때 예외가 많이 발생함 java는 예외처리 위해 throws 문자를 씀
	System.out.println(keyCode);
	
	keyCode = System.in.read(); 
	System.out.println(keyCode);
	
	keyCode = System.in.read(); 
	System.out.println(keyCode);
	
	/*while(true) //값을 꼐속 입력받을려고 한느 짓
		{ keyCode = System.in.read();
		System.out.println(keyCode);
	}*/
	
	//주석처리를 꼭 해야만 밑에 scanner에 영향을 안끼침
	//p 95
	
	Scanner scanner = new Scanner(System.in);
	
	String inputData = scanner.nextLine();
	System.out.println(inputData);
	
	
	//컨트롤 시프트 o 누르면 맨위에 자동으로 import 선언이 생김 에도 new 는 빨간줄 어디 걸 읽어드릴꺼냐
//nextline 은 . 까지의 모든 문장을 읽겠따	
	
	
	
	
	
	
	
	
	
	}

}
