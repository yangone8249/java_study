package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class LambdaEx02 {

	public static void main(String[] args) {
		// stream(스트림) : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		/* 요소가 하나씩 흘러가는 형태로 처리
		 * stream은 한번사용하면, 재사용 불가
		 * - 스트림을 생성하여 연산을 수행한다면 스트림은 소모가됨.
		 * - 재사용하려면 스트림을 다시 생성 후 사용해야함.
		 * 스트림의 장점 : 자료를 복제해서 사용하므로, 기존의 자료에 영향을 안끼침
		 * 중간연산 : filter(조건에 맞는 요소 추출), distinct(중복제거), sorted(정렬), map(추출)
		 * 최종연산 : sum(), forEach(향상된 for문), reduce(요소를 하나씩 줄여가며 계산)
		 */
		Stream<Integer> integerStream1 = Stream.of(1,2,3,4,5,6,7,8,9);
		
		int[] arr = {1,2,3,4,5};
		long count =	Arrays.stream(arr).count();
		System.out.println(count);
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		//성적 배열a에서 70점이상인 점수만 합계
		
		int[] a = {50, 78, 90, 20, 31, 85, 63,100};
		int total =0;
		for(int i=0;i<a.length; i++) {
			if(a[i]>=70) {
				total += a[i];
			}
		}
		System.out.println(total);
		
		total = Arrays.stream(a).filter(b/*필터안에 매개변수는 a와 다른값을 줘야한다.*/ -> b>=70).sum();
		System.out.println(total);
		
		//성적 리스트를 생성하고, 스트림을생성한 후 70이상 점수를 합계
		
		List<Integer> list = new ArrayList<>();
		list.add(70);
		list.add(50);
		list.add(100);
		list.add(80);
		list.add(20);
		list.add(10);
		int sum1=0;
		Stream<Integer> s = list.stream();
//		s.filter(n->n>=70).forEach(n-> System.out.println(sum1+=n));
		
		
	}

}
