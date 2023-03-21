package day18;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		/* 문자열(이름)을 담는 리스트 생성 후, 스트림으로 생성
		 * 정렬하여 출력
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("라asdsa");
		list.add("마23213");
		list.add("바");
		list.add("사");
		list.add("가asdsada");
		list.add("나");
		list.add("다dd");
		
		
		
		Stream<String> s = list.stream();
		s.sorted().forEach(n-> System.out.println(n));
		
		//글자수가 5글자 이상인 이름만 출력
		
		System.out.println("---------");
		
			list.stream().filter(n-> n.length() >= 5).forEach(System.out::println);
		
		//각자 이름의 글자수를 출력
			System.out.println("---------");
			list.stream().map(n->n.length()).forEach(System.out::println);
		
		System.out.println("----------\n종료");
	}

}
