package day19;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

public class PrintWriterEx01 {

	public static void main(String[] args) throws IOException {
		/* PrintWriter : 개체의 형식화된 표현을 텍스트 출력 스트림으로 출력한다.
		 * Println, print, printf 
		 */
		PrintWriter pw = new PrintWriter(System.out);
		
		String str = "Hello";
		
		pw.print(str);
		pw.println();
		pw.println(str);
		pw.printf("%.2f", Math.PI);
		
		
		pw.flush(); // 메모리(버퍼) 내부에 잔류중인 Byte를 지우는 함수
		pw.println("\n\n파일확인");
		pw.close(); // close를 닫아줘야 결과가 나온다.
		// close만 사용해도 자동적으로 flush도 적용되기때문에 flush는 크게 상관없다.
		
		PrintWriter pw1 = new PrintWriter("text2.txt"); // 파일에 대한 에러가 날 수도있어, Exception 정의
		for(int i=0; i<10; i++) {
			String data = i+" Test2 입니다."; //변수와 + 로 문자열도 합치기 가능
			pw1.println(data);
		}
		pw1.close();
		
		//추가모드로 파일에 data를 추가
		//File은 추가모드가능, Print는 추가모드가 없음. (File객체를 생성하여 사용)
		PrintWriter pw2 = new PrintWriter(new FileWriter("text2.txt"/*추가하려면 파일명이 같아야함*/,true)/*파일경로 대신 new File로 새로운 객체 생성*/);
		
		for(int i=11; i<=20; i++) {
			String data = i+" Test2 입니다. (new File 객체 생성)";
			pw2.println(data);
		}
		pw2.append('+'+"\n");
		pw2.append("Hello");
		pw2.close();
		
	}

}
