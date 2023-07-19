package j07191;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int mon;
		do {
		System.out.print("올바른 월을 입력하세요[1~12]: ");
		mon=s1.nextInt();
		}while(mon<1 || mon>12);
		System.out.println("사용자가 입력한 월은 "+mon);
		}

	}


