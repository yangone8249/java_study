package day19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Key;
import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BufferedReaderEx03 {

	public static void main(String[] args) throws IOException {
		// out.txt파일 읽어와서 map에 저장 후
		/* 이름 : 점수
		 * 총합계, 총인원 출력하기
		 */
		
		BufferedReader br= new BufferedReader(new FileReader("out.txt"));
		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> list = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		int total=0, cnt=0;
		String print;
		
		// 괄호 안은 조건식으로 구분
		while((print = br.readLine())!=null) {
			
			String[] arr = print.split(" ");
				String k = arr[0];
				int v = Integer.parseInt(arr[1]); // 텍스트파일에 있는 문자열을 정수형으로 변환
				total += v;
				cnt++;
				map.put(k, v);
				
				list.add(k);
				list2.add(v);
			
		}
		System.out.println("------- 정렬한 List출력");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+" "+list2.get(i));
			
		}
		System.out.println("총 인원수:"+cnt);
		System.out.println("총 합계:"+total);
	
		System.out.println("------- 정렬없는 Map출력");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+" "+map.get(tmp));
		}
		System.out.println("총 인원수:"+cnt);
		System.out.println("총 합계:"+total);
		
	}

}