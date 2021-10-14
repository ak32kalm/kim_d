package com.yedam.java.ch0201;

public class variableExample {
   public static void main(String[] args) {
	int hour = 3;
	int minute = 5;
	System.out.println(hour+"시간" +minute+"분");
	// hour -> 3 + "시간" + minute -> 5 + "ㅜㄴ"
	   // 3시간 5분
	
	int totalMinute = (hour*60) + minute;
	   System.out.println("총" + totalMinute + "분");
	 
	   
	   
	   int x, y, z;
	   
	   x = 1;
	   y = 2;
	   z = x + y;
	   
	   System.out.println(x + "+" + y + "=" + z);
	   
	   
	   int p, q;
		   
	   p = 54;
	   q = 36;
      
	   System.out.println((p+q)+","+(p-q)+","+(p*q)+","+(p/q));
        
	  
	  int j, k, l;
	  
	  j = 54;
	  k = 36; 
	  l = 0;
	  
	 l = j + k;
	 System.out.println(j +"+"+ k +"="+ l);
			  
	 l = j - k;
	 System.out.println(j +"-"+ k +"="+ l);
	
	 l = j * k;
	 System.out.println(j +"*"+ k +"="+ l);
	 
	 l = j / k;
	 System.out.println(j +"/"+ k +"="+ l);
			  
	 
	 int temp;
	 temp = j;
	 j = k;
	 k = j;
	 
	 System.out.println("j: "+j+ ", k:" + k);
	 
	 
	 /*int v1 = 0;
	 if(v1 >= 0) { 
		 v1 = 1;
		 int v2 = 0;
		 if(v2 == 0) {
			 v2 = 2;
			 int v3 = v1 + v2;
			 System.out.println("v1:" + v1 + ", v2:" + v2 + ", v3:" + v3 );
		 }
		  }*/
	
	 
	 int n = 21;
	 int sum = m+n;
	 
	 int m =10;
	 if(m>=10) {
		
	 }System.out.println("sum :"+ sum);
	 
}
}
