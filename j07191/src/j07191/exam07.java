package j07191;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1=s1.nextInt();
		for(int i=1;i<=num1; i++) {
			for(int j=1;j<=i;j++) {
			System.out.print('*');
			}
			System.out.println();
		}
		}

	}


