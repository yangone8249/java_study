package day15;

import java.util.Arrays;

public class subject {

	/* class - subject (별도 생성)
	 * 과목클래스에서 나타내는것은 = 한 과목의 정보를 나타내는 클래스
	 * ㄴ 과목코드, 과목명, 학점, 시수(시간), 교수명, 학기, 전공or교양, 수업시간표
	 */
	
	// 중요!! ** 멤버변수 - 생성자 - get/set - costructor - toString 은 많이 사용하며 꼭 필요함.
	// 멤버변수 선언 - 일반적으로 private으로 선언함.
	int srades, classTime;
	String subCode;
	String subName, professor, semester,major, schedule; 
	
	//생성자 : 객체를 생성할 때 기본적으로 setting 하고자 하는 값을 미리 입력받아서 생성
	//생성자는 기본 아무것도 없는 값을 가지고 있음. => 생성자를 추가하지 않는다면 자동 생성
	//추가생성자를 만든다면 기본 생성자는 사라짐.(자동생성 하지 않음 => 직접 만들어야 함.)
	public subject() {}
	
	// 과목명 만 받는 생성자
	public subject(String subName) {
		this.subName = subName;
	}
	// 과목코드, 과목명, 학점을 받는 생성자
	public subject(String subCode, String subName, int srades) {
		this.subCode = subCode;
		this.subName = subName;
		this.srades = srades;
	}
	//전체 데이터를 받는 생성자 ** source - constructor using field
	public subject(int srades, int classTime, String subCode, String subName, String professor, String semester,
			String major, String schedule) {
		this.srades = srades;
		this.classTime = classTime;
		this.subCode = subCode;
		this.subName = subName;
		this.professor = professor;
		this.semester = semester;
		this.major = major;
		this.schedule = schedule;

	}
	
	// source - toString으로 출력
	@Override
	public String toString() {
		return "subject [srades=" + srades + ", classTime=" + classTime + ", subCode=" + subCode + ", subName="
				+ subName + ", professor=" + professor + ", semester=" + semester + ", major=" + major + ", schedule="
				+ schedule + ", getSrades()=" + getSrades()
				+ ", getClassTime()=" + getClassTime() + ", getSubCode()=" + getSubCode() + ", getSubName()="
				+ getSubName() + ", getProfessor()=" + getProfessor() + ", getSemester()=" + getSemester()
				+ ", getMajor()=" + getMajor() + ", getSchedule()=" + getSchedule() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
//
//	void korean() {
//		this.code = 01;
//		this.srades = 3;
//		this.classTime = 1;
//		this.professor = "양휘원";
//		this.semester = "1학기";
//		this.major = "교양";
//		this.schedule = "화요일";
//		this.arraySubject[0] = "국어";
//	}
//	
//	
//
//	void math() {
//		this.code = 02;
//		this.srades = 3;
//		this.classTime = 1;
//		this.professor = "양휘투";
//		this.semester = "1학기";
//		this.major = "교양";
//		this.schedule = "화요일";
//		this.arraySubject[1] = "수학";
//	}
//	void history() {
//		this.code = 03;
//		this.srades = 3;
//		this.classTime = 1;
//		this.professor = "양휘투";
//		this.semester = "1학기";
//		this.major = "교양";
//		this.schedule = "목요일";
//		this.arraySubject[2] = "역사";
//	}
//	void javaProgramming() {
//		this.code = 04;
//		this.srades = 4;
//		this.classTime = 3;
//		this.professor = "오미란";
//		this.semester = "1학기";
//		this.major = "전공";
//		this.schedule = "수요일";
//		this.arraySubject[3] = "JAVA프로그래밍";
//	}
//	void cProgramming() {
//		this.code = 05;
//		this.srades = 4;
//		this.classTime = 2;
//		this.professor = "장미란";
//		this.semester = "1학기";
//		this.major = "전공";
//		this.schedule = "수요일";
//		this.arraySubject[4] = "C프로그래밍";
//	}
//	void webServerProgramming() {
//		this.code = 06;
//		this.srades = 4;
//		this.classTime = 3;
//		this.professor = "장미란";
//		this.semester = "1학기";
//		this.major = "전공";
//		this.schedule = "월요일";
//		this.arraySubject[5] = "웹서버프로그래밍";
//	}
//	
//	
//	
	
	public int getSrades() {
		return srades;
	}
	public void setSrades(int srades) {
		this.srades = srades;
	}
	public int getClassTime() {
		return classTime;
	}
	public void setClassTime(int classTime) {
		this.classTime = classTime;
	}
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
}
