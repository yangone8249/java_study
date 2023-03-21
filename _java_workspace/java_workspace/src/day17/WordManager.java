package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class WordManager implements WordInterface {

	private ArrayList<Word> word = new ArrayList<>();
	private int cnt=-1;
	
	
	@Override
	public void add(Scanner scan) throws IOException {
		// TODO Auto-generated method stub
		
		
		cnt++;
		System.out.println("추가할 단어를 입력하세요");
		String word = scan.next();
		System.out.println(word+"의 의미를 입력하세요");
		String mean = scan.next();
		
		
		
		Word w = new Word(word,mean);
		
		this.word.add(w);
		
	}

	@Override
	public void print() {

		
		
	
	}

	@Override
	public void read(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("검색할 단어를 입력하세요");
		String search = scan.next();
		
		for(Word str : word) {
			if(search.equals(str.getWord())) {
				System.out.println(str.getWord()+":"+str.getMean());
				return;
			}
		}
		System.out.println("없는 단어 입니다.");
	}

	@Override
	public void update(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("어떤 단어를 수정하시겠습니까?");
		String search = scan.next();
		
		int i=0;
		for(Word str : word) {
			i++;
			if(search.equals(str.getWord())) {
				
				System.out.println("바꿀 단어를 입력하세요");
				String updateWord = scan.next();
				System.out.println("바꿀 의미를 입력하세요");
				String updateMean = scan.next();
				
				str.setWord(updateWord);
				str.setMean(updateMean);
				
				return;
			}
		}
		
		
	}

	@Override
	public void delete(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("삭제할 단어를 입력하세요");
		String delete = scan.next();
		word.remove(delete);
		
	}
	public void newFile() throws IOException {
		FileWriter fw = new FileWriter("newfile.txt");
		
//		fw.write();
		
	}
	
	
}
