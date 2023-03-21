package day15;

import java.util.Scanner;

public class programManager implements program {

	 /* class - studentManager (인터페이스 구현)
	  ㄴ program 인터페이스에 대한 구현임.
	 */
	//멤버변수 student class, stdCount 변수
	private student[] std = new student[10]; // student클래스를 배열로 1~10개까지 만듬
	private int stdCount=0; // 등록한 학생을 카운트하는 변수
	subject s = new subject();

	// 과목에 대한 클래스는 함수로이루어진게 아니라 생성자로만 정해져있어 객체를 가져올 필요가 없다.
	// subject는 student를 위한 클래스이다.
	// subject sub = new subject();
	
	@Override
	public void printStudent() {
		System.out.println("\n\n\n\n");
		if(std[0]==null) {
			System.out.println("등록된 학생이 없습니다.");
		}
		for(int i=0; i<stdCount; i++) {
			std[i].stdPrint(); // 학생정보만 출력
			//printStdOne(std[i]); // 학생정보+수강정보
			System.out.println("-----------");
		}
		
		
		System.out.println("\n\n\n\n");
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 한명의 학생정보 값을 입력받아 객체를 생성한 후 등록
		
		System.out.println("학생의 이름은? : ");
		String name = scan.next();
		System.out.println("학생의 학번은? : ");
		String num = scan.next();
		System.out.println("학생의 주민번호는? : ");
		String registerNum = scan.next();
		System.out.println("학생의 학부는? : ");
		String faculty = scan.next();
		System.out.println("학생의 학과는? : ");
		String major = scan.next();
		// student 객체를 생성 후 스캔한 내용을 입력해주기
		student s = new student(name, num, registerNum, faculty, major);
		// 배열이 다 찼는지 확인 
		if(std.length == stdCount) {
			//다 찼으면 기존의 배열에 +5 크기를 더 만들고 다시 std배열에 넣기
			student[] tmp = new student[std.length+5];
			System.arraycopy(std, 0, tmp, 0, std.length);
			std = tmp;
		}
		// std[]배열안에 = s 생성자를 대입.
		std[stdCount] = s;
		stdCount++;

	}

	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("\n\n\n\n");
		// 검색할 학생 이름을 입력받고
		// 확인 시 학생정보와 수강정보 출력	
		System.out.println("검색할 이름은? : \n");
		String search = scan.next();
		for(int i=0; i<stdCount; i++) {
			if(search.equals(std[i].getStdName())) {
				printStdOne(std[i]);
				
				
				System.out.println("\n\n\n\n");
				return;
			}
		}
			System.out.println("해당 학생은 등록이 안되어있습니다.");
			System.out.println("\n\n\n\n");
	}
		

	@Override
	public void registerSubject(Scanner scan) {
		System.out.println("\n\n\n\n");
		//수강신청자 체크 (학생)
		// 신청자 체크하는법 : 신청할 학생의 배열 index변수를 따로 선언하여 확인
		// 이름or학번으로 확인
		System.out.println("수강신청할 학생명 : ");
		String search = scan.next();
		for(int i=0; i<stdCount; i++) {
			if(search.equals(std[i].getStdName())){
				System.out.println(search+"학생의 수강신청 과목명을 입력해주세요 : ");
				String name = scan.next();
				
				subject s = new subject(name);
				
				std[i].insertSubject(s);
				
				System.out.println(name);
				System.out.println("\n\n\n\n");
				return;
			} 
		}
		System.out.println("해당 학생은 등록이 안되어있습니다.");
		System.out.println("\n\n\n\n");
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("\n\n\n\n");
		System.out.println("수강철회할 학생명 : ");
		String stdName = scan.next();
		for(int i=0; i<stdCount; i++) {
			if(stdName.equals(std[i].getStdName())) {
				
				System.out.println(stdName+"학생의 수강신청 과목명을 입력해주세요 : ");
				String name = scan.next();
				
//				for(int j=0; j<std[i].getSubCount(); j++) {
//					if(name.equals(s.getSubName())) {
//						subject s = new subject(name);
//						std[i].deleteSubject(s);
//						System.out.println(name);
//						System.out.println("\n\n\n\n");
//						return;
//					}
					
					
//				}
				
			}
		}
		System.out.println("해당 학생은 등록이 안되어있습니다.");
		System.out.println("\n\n\n\n");
		
	}

	//1명의 학생정보+수강정보 같이출력하는 메서드
	public void printStdOne(student s) {
		System.out.println("---학생정보---");
		s.stdPrint();
		System.out.println("---수강정보---");
		s.subPrint();
	}
	
}
