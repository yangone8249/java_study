package day17;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalEx {

	public static void main(String[] args) {
		// BigDecimal : java에서 숫자를 정밀하게 저장 and 표현하기 위한 클래스
		/* 돈, 소수점(정밀한) 계산이 필요한 경우에는 필수
		 * 단점 : 느린속도 
		 */
		//값 초기화를 하기 위해서는 문자열로 값을 지정해야한다.
		BigDecimal db = new BigDecimal("1000.1234");
		BigDecimal db1 = new BigDecimal("1000.1234");
		BigDecimal db2 = new BigDecimal("100");
		
		System.out.println(db);
		// 객체의 주소가 같은지 비교(==), 값이 같은지 비교를 위해서는 equals가 필요.
		System.out.println(db.equals(db1));
		System.out.println(db == db1);
		//compareTo : 값을 비교 시 같으면 0 작으면 -1, 크면 1
		System.out.println(db.compareTo(db2));
		//값을 더할땐 add함수를 이용한다, 빼기는 subtract, 곱샘 multiply, 나누기 divide, 나머지 remainder
		System.out.println("더하기:"+db.add(db2));
		System.out.println("빼기:"+db.subtract(db2));
		System.out.println("곱하기:"+db.multiply(db2));
		System.out.println("나누기:"+db.divide(db2));
		System.out.println("나머지:"+db.remainder(db2));
		//최댓값, 최소값 max,min
		System.out.println("max:"+db.max(db2));
		System.out.println("min:"+db.min(db2));
		
		// BigInteger : 좀더 정밀한 int자료형을 처리해야할때
		BigInteger bi = BigInteger.valueOf(100000); // 일반 int값으로 대입
		System.out.println(bi);
	
		int int_bi = bi.intValue(); // Integer를 -> int 형변환
		long long_bi = bi.longValue();	// Integer를 -> long 형태로 형변환
		String string_bi = bi.toString(); // Integer를 -> String 형태로 형변환 (toString 많이씀)
		
	
	}

}