package day19;

import java.io.File;
import java.util.StringTokenizer;

public class FileObjectEx01 {

	public static void main(String[] args) {
		/* 파일이 가지고 있는 정보 출력
		 * D:\_java_workspace\java_workspace\out.txt
		 */
		File f = new File("D:\\_java_workspace\\java_workspace\\out.txt"); //문법에서는 (\\) 두개씩 구분함.
		
		String fileName = f.getName();
		System.out.println(fileName); //경로를 제외한 파일이름만 출력
		System.out.println(f.getPath()); //파일에 대한 경로+이름 같이 출력
		System.out.println(f.getAbsolutePath()); // 경로+이름을 포함 (절대경로)
		System.out.println(f.getParent()); //파일에 속한 경로만 출력
		System.out.println(File.separator); // 파일 구분자 (가장 많이 사용)
		System.out.println(File.separatorChar); // 파일 구분자를 문자형으로 출력
		
		System.out.println("\n----경로 분리----\n");
		//시스템에서 직접 알아낸 사용자파일의 경로는 분리
		String fstr = f.toString();
		System.out.println(fstr); // 경로+파일명
		// 경로의 일부만 출력 (toString에서 추출 / 실제 자주사용함)
		// 파일명만 추출 후 출력
		// 파일 경로만 추출 후 출력
		System.out.println("드라이브:"+fstr.substring(0,fstr.indexOf("\\"))); // 실제경로는 \\로 구분하기때문에 두개써서 값추출
		System.out.println("파일명:"+(fileName));
		System.out.println("경로:"+fstr.substring(fstr.indexOf(f.separator)+2,fstr.indexOf(f.getName())-1));
		
		//파일명과 확장자 분리
		System.out.println(f.getName());
		String[] str = f.getName().split(File.separator+".");
		System.out.println("파일명:"+str[0]+" 확장자:"+str[1]);
		
		//StringTokenizer 클래스 사용
		StringTokenizer stk = new StringTokenizer(f.getName(), "."); //"."으로 구분
		while(stk.hasMoreElements()) { //String을 하나씩 비교하여 다음토큰에 값이있다면 true or false
			//iterator와 유사함
			System.out.println(stk.nextElement());
		}
		
	}

}
