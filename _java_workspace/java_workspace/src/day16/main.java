package day16;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ProductManager p = new ProductManager();
		do {
			System.out.println("1.메뉴추가(create)   2.메뉴리스트(read)   3.주문하기   4.삭제(delete)   5.수정(update)   6.프로그램 종료");
			int select = scan.nextInt();
			
			switch(select) {
			case 1: p.add(scan); break;
			case 2:	p.printProduct(); break;
			case 3: p.orderPick(scan); break;
			case 4: p.delete(scan); break;
			case 5: p.update(scan); break;
			case 6: System.out.println("프로그램 종료."); return;
				default : System.out.println("잘못입력하셨습니다."); continue;
			}
		}while(true);
	}

}
