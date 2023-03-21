package day18;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StreamEx04 {

	public static void main(String[] args) {
		/*여행상품
		여행비용은 15세이상100만원, 15세 미만 50만원
		고객 3명이 패키지 여행을 떠나려할때
		1.비용계산
		2.비용계산
		
		스트림으로 표현
		고객은 클래스로 생성
		Arraylist로 추가
		
		 */
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("양휘원", 24, 100));
		list.add(new Customer("민소희", 23, 100));
		list.add(new Customer("양겨울", 1, 50));
		
		list.stream().filter(a->a.getAge()>15).forEach(a->
		{System.out.printf("이름:%s 나이:%d 비용:%d만원\n",a.getName(),a.getAge(),a.getCost());
		});
		
		list.stream().filter(a->a.getAge()<15).forEach(a->System.out.printf("이름:%s 나이:%d 비용:%d만원\n",a.getName(),a.getAge(), a.getCost()));
		
		System.out.println("합계:"+list.stream().mapToInt(a->a.getCost()).sum());
		//20세 이상 성인만 이름을 정렬하여 출력
		
		list.stream().filter(a-> a.getAge()>=20).forEach(a-> System.out.println("20세이상 : "+a.getName()));
	}

}
class Customer{
	private String name;
	private int age;
	private int cost;
	
	public Customer(String name, int age,  int cost) {
		this.name = name;
		this.age = age;
//		this.cost = (age>15) 100 ? 50;
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}