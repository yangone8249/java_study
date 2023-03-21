package day19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx01 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader : 문자 보조스트림 (버퍼를 많이 사용함)
		 * 라인단위로 읽어올 수 있다. (성능이 빠름)
		 * 더이상 읽을 라인이 없을경우 null을 리턴
		 * 보조스트림은 직접 읽고 쓸수가 없음.
		 * 보조스트림을 사용할 경우 생성자에 기반스트림을 매개변수로 사용해야함.
		 * */
		BufferedReader br = new BufferedReader(
				new FileReader/*기반스트림인 FileReader를 생성해 매개변수로 사용함*/
				("C:\\Users\\EZENIC-165\\Downloads\\input.txt")); //다른경로에 있는 파일도 출력가능
		while(true) {
			String line = br.readLine(); //한 라인단위로 읽기때문에 read+Line이라는 변수명을 사용해야함.
			if(line == null) {
				break;
			}
			System.out.println(line);
			
		}
		br.close();
		
		
	}

}
