package day19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import day17.Word;

public class WordManager {
	/* day17 패키지에서 생성한 Word 클래스 객체화 후 사용
	단어등록
	
	단어검색
	단어수정
	단어출력
	파일로 출력
	 */
	ArrayList<Word> list = new ArrayList<>();
	
	public void printMenu() {
		System.out.println("--단어장 프로그램--");
		System.out.println("1.단어등록|2.단어검색|3.단어수정|4.단어출력\n5.파일로 출력|6.단어삭제|7.프로그램 종료");
		System.out.println("----------------------------");
		System.out.println("menu > ");
	}
	public void addWord() {
		list.add(new Word("hello","안녕"));
		list.add(new Word("hi","안녕"));
		list.add(new Word("apple","사과"));
		list.add(new Word("orange","오렌지"));
		list.add(new Word("banana","바나나"));
	}
	public void insertWord(Scanner scan) {
		System.out.println("단어입력:");
		String word = scan.next();
		System.out.println("의미입력:");
		String mean = scan.next();
		
		list.add(new Word(word, mean));
		
	
	}
	public void searchWord(Scanner scan) {
		System.out.println("검색단어입력:");
		String search = scan.next();
		for(Word w : list) {
			if(w.getWord().equals(search)) {
				System.out.println(w.getWord()+":"+w.getMean());
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
		
	}
	public void modifyWord(Scanner scan) {
		System.out.println("검색할 단어 입력:");
		String word = scan.next();
		System.out.println("수정단어입력:");
		String newWord = scan.next();
		System.out.println("수정의미입력:");
		String mean = scan.next();
		Word w = new Word(word, mean);
		
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				
				list.set(i, w);
				return;
			}
		}
		System.out.println("검색단어가 없습니다.");
	}
	public void printWord() {
		
		System.out.println("--단어장--");
		
		Collections.sort(list);
		for(Word w : list) {
			System.out.println(w);
		}
		
		System.out.println("-----------");
	}
	public void fileWord() throws IOException {
		FileWriter fs = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		// 단어장의 list 값을 String화 하기위해 StringBuffer 객체 생성
		StringBuffer sb = new StringBuffer();
		String data = null;
		int cnt=0;
		sb.append("단어장\n");
		
		while(cnt < list.size()) {
			sb.append(list.get(cnt));
			sb.append("\r\n");
			cnt++;
		}
		data = sb.toString();
		System.out.println(data);
		bw.write(data);
		
		bw.close();
		fs.close();
	}
	public void deleteWord(Scanner scan) {
		System.out.println("삭제단어입력:");
		String word = scan.next();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				
				list.remove(i);
				return;
			}
		}
	}
	
	
}
