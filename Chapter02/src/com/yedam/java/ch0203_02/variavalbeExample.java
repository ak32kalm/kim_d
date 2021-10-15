package com.yedam.java.ch0203_02;

public class variavalbeExample {

	public static void main(String[] args) {
		
		byte byteValuel = 10;
		byte byteValue2 = 20;
		
		//byte result = byteValuel + byteValue2;
//byte를 연산하려고 보면 int라고 값을 인지함 자바가
		// int + int
		
		int byteResult = byteValuel + byteValue2;
		
		//정수값을 연산할때 int 값보다 작으면 int로 바뀌고 long 보다 크면 long으로 바뀜
		
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//오류 char carhResult = charValue1 + charValue2; 
		int charResult = charValue1 + charValue2;
		
		int intValue1 = 10;
		int intValue2 = intValue1/4;
		//오류는 발생하지않음 연산식 자체에는 문제가없음 - 2.xxx 소수자 이하를 다버림 - 결과값2
	     
		
		System.out.println("byteResult: " + byteResult);
		System.out.println("charResult, 유니코드 값 : " + charResult);
		System.out.println("charResult, 출력문자 :"+ (char)charResult);
		System.out.println("intValue2 : "+ intValue2);
		
		//정확하게 소수점까지 표현하는 방법
	    double doubleValue = intValue1/4;
	    /*intValue1/4 -> intValue1 이 10이되고
	    4
	     10 / 4
	    정수형끼리의 연산이니까 2.5를 2로 표기
	    double 타입 doubleValue =2;
	    2.0*/
	
	    
	    double doubleValue2 = intValue1/4.0;
	    double doubleValue3 = (double)intValue1/4;
	    
	    System.out.println(doubleValue);
		System.out.println(doubleValue2);
		System.out.println(doubleValue3);
		
		
		
System.out.println("=====Quiz");
byte x = 10;
byte y = 20;
int m = 30;
long n = 70L;

int result1 = x + y + m; //int + int + int => 결과값도 int 값을 담을 수 있어야함
System.out.println(result1);

long result2 = x + y + n; 
//byte 타입은 int로 인식이 됨 -> int+int+long => 범위가 큰 걸로 계산이 된걸로인식
//long + long + long => 결과값이 long type으로 선언 되야함
System.out.println(result2);

int x1 = 100;
long y1 = 140L;
float f1 = 3.14F;
double d1 = 10.15;

float result3 = x1 + y1 + f1;
//int + long + float => long + float => 소수점 이하로 계산이 되기 때문에 표현범위가 큰 기준으로 연산이 되기때문에 float type으로 선언해야함
System.out.println(result3);

double result4 = y1 + f1 + d1;
//long + float + double =>  double
System.out.println(result4);
		
		int value = 10 + 2 + 8; // 10 + 2 -> 12 + 8
		String str1 = 10 + 2 + "8"; //12 + "8" ; 하나는 상수고 하나는 문장이다 자바는 문장은 건들지 않고 상수를 건드림 => 상수를 강제로 문장으로 변환시킴 "12" => "12" + "8" = 128;
		String str2 = 10 + "2" + 8; // => 1028;
		String str3 = "10" + 2 + 8; // => 1028;
		String str4 = "10" + (2 + 8); // => 1010;
		
		System.out.println(value);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		int value1 = Integer.parseInt("10") + 2 + 8;
		//괄호안의 값을 int 값으로 변환시켜주는 함수 -p83참조
		System.out.println(value1); 
		
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		//정상적으로 true가 들어갔다면 if문이 실행돠야함
		
		if(value3) { double result = value2 + 1;
		System.out.println(result); 
		}
	
		String str5 = String.valueOf(10);
		String str6 = String.valueOf(10.5);
		String str7 = String.valueOf(true);
		//valueOF는 상수를 문자로 인식
		String strResult = str5 + str6 + str7;
		System.out.println(strResult);

	
		System.out.println("========Quiz2");
		
		int a = 10;
		int b = 2;
		double c = 4.75;
		String str = "숫자결합";
		

		String strResult1 = a + str + (b + c);
		System.out.println(strResult1);
		
		//           10숫자결합6.75 
		
		
		
		
		
		//p89 변수와 시스템 입출력
		
		System.out.print("===========Quiz")
	
	
	
	
	
	
	
	}

}
