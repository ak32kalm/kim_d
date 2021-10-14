package com.yedam.java.ch0203;

public class variableExample {

	public static void main(String[] args) {
	
		byte bytevalue = 10;
		int intValue = bytevalue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 값:" + intValue);
				
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:" +longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: "+floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		
		System.out.println("===== 강제 타입 변환 =====");

		
		int intValuel = 44032;
		char charValuel = (char)intValue;
		System.out.println("charValue1 : " + charValuel );

        long longValuel = 500;
        intValue = (int)longValue;
        System.out.println("intValuel : " + intValuel);
        
        double doubleValuel = 3.14;
        intValuel = (int)doubleValuel;
        System.out.println("intValuel : " + intValuel);
	
	
	
	System.out.println("===== Quiz");
	byte byteValue = 65;
	char resultl = (char) byteValue;
	System.out.println(resultl);
		
	char charValue2 = 'B';
	short result2 = (short)charValue2;
	System.out.println(result2);
	
	float floatValuel = 3.14f;
	int result3 = (int)floatValuel;
	System.out.println(result3);	
	
        
	
	
	
	
	
	
	
	}

}
