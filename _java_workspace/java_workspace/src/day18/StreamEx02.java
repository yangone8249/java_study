package day18;

import java.util.Arrays;

public class StreamEx02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬)
		 * 중복되는 값은 삭제
		 */
		int arr[] = {5,6,3,4,5,6,7,8,1,2,3,4,1};
		
		Arrays.stream(arr).filter(a -> a%2==0).sorted().forEach(a->System.out.println(a)); 
	}

}
