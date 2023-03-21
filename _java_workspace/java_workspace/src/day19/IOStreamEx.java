package day19;

import java.io.IOException;

public class IOStreamEx {

	public static void main(String[] args) {
		/* java를 포함한 모든 프로그램은 입력스트림과 출력스트림을 통해 데이터를 입출력한다.
		 * 스트림 : 단방향으로 데이터가 흘러가는 형태 (입,출력 스트림은 별도로 구성)
		 * 다양한 입출력 장치에 의해 입출력이 진행된다.
		 * 다양한 장치에 독립적으로 일관성있는 입출력을 유지하기 위해서 입출력스트림을 통해 일관성을 제공한다.
		 * 2가지 형태의 Stream 구분
		 * 1. 바이트 형태의 스트림 : 기본형태(1Byte문자, 숫자, 그림, 멀티미디어)
		 * 2. 문자 형태의 스트림 : 문자만 입출력할 때 사용
		 * 
		 *  - 바이트 스트림의 입출력 // 주로 사용하는 하위클래스
		 *  1. 입력 : InputStream(최상위 클래스) : FileInputStream, BufferedInputStream, DataInputStream
		 *  2. 출력 : OutputStream : FileOutputStream, PrintStream, BufferedOutputStream, DataOutputStream
		 *  - 문자 스트림의 입출력
		 *  1. 입력 : Reader(최상위클래스) : FileReader, BufferedReader, InputStreamReader
		 *  2. 출력 : Writer : FileWriter, PrintWriter, BufferedWriter
		 *  
		 *  - 기반스트림(대상에서 직접 자료를 읽고 쓸수있는 기능을 가진 스트림) / 보조스트림(직접 읽고 쓰는 기능은 없지만 추가적인 기능을 더해주는 스트림)
		 *  1. 기반스트림 : FileInputStream, FileOutputStream, FileReader, FileWriter...
		 *  2. 보조스트림 : InputReader, OutputReader, BufferedReader, BufferedWriter...
		 *  
		 */
		
		System.out.println(); // 표준 출력(모니터) 스트림
		try {
			System.in.read();// 표준 입력(키보드) 스트림
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		// 표준 에러 출력 스트림
		System.err.println();
		
		
		
	}

}
