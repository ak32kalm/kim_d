package com.yedam.java.feedback;

public class Ch02 {
	public static void main(String[] args) 
	{
		int a;
		int b;
		
		
		a = b = 10; // b = 10 담고,  a = b  // 변수를 선언할때 오른 쪽에서 왼쪽 방향으로 흘러감
		System.out.println("a:" + a + ",b:" + b);
		
		int result = a + b; // a: 10 + b: 10 = 20 -> result라는 변수에 담겠다
		
		System.out.println("result:" + result);
		
		if(result > 5) //괄호 안에 값이 참이면 중괄호 안의 명령문을 실행시킴
			{ int c = 100;
			result = a + b + c;
			System.out.println("a:" + a + ", b: " + b + ", c: " + c);
			System.out.println("result: " + result);
		}
		
	
		System.out.println("==================================");
		
	
	byte byteValuel = 127; // byte 정수형 중 가장 작은 값
    //byte byteValue2 = 128;
	/* 주석내용 */
	short shortValue1 = 129;
	short shortValue2 = 32767;
    //short shortValue2 = 23768;
	int intValuel = 32768;
	long longValuel = 21475687978L; // long type은 숫자다음에 L 을 붙여야함
	
	System.out.println(byteValuel);
	System.out.println(shortValue1);
	System.out.println(shortValue2);
	System.out.println(intValuel);
	System.out.println(longValuel);
	
	char charValuel = 'A';
	// char 메모리에 가보면 65라고 저장 되어있음
	System.out.println("charValuel :" + charValuel);
	System.out.println("charValuel의 유니코드 값 :" + (int)charValuel);
	
	// '' 한 글자를 사용하는 문자구나 "" 문장이구나
	//char cahrValuel2 = "A"; //string 으로 바꾸라고 오류가 남
	
	String str1 = "A";
	String str2 = "홍길동, 문장!"; //특수문자나 스페이스바도 출력을함	
	
	System.out.println(str1);
	System.out.println(str2);
	
	float floatValue1 = 3.14F; // F을 붙여
	double doubleValue2 = 3.14;
	
	float floatValue2 = 0.1221412512412F;
    double doubleValue3	= 0.1221412512412F;
    System.out.println(floatValue2);
    System.out.println(doubleValue3);
    
    //논리타입 
    boolean stop = true;
    stop = false;
    
    System.out.println("==================================");
    
    ///자동타입변환
    byte bValue = 100;
    int iValue = bValue;  // 작은컵에 담겨진 내용물이 큰 컵으로 옮겨도 어떤 값도 손실안됨
    
    System.out.println(iValue);
    
    //강제타입변환
    double dbValue = 198.87632;
    long lnValue = (long)dbValue; // ()강제선언 
    System.out.println(lnValue);
	
    //2021-10-15---------------------------------------------------
    
    //연산식안에서의 타입변환
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}
}
