package j07191;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int sum=10000;
		System.out.printf("교통카드 잔액 : %d",sum);
		
		int amt=0;
		
		while(true) {
			System.out.print("교통카드 사용액 : ");
			amt=s1.nextInt();
			sum=sum-amt;
			System.out.printf("교통카드 잔액 : %d\n", sum);
			if(sum<1300) {
				System.out.println("교통카드 잔액이 부족하여 사욜할 수 없습니다");
				break;
			}
		}
		/*int i=1;
		while(i<=10) {
			System.out.println(i);
			i++; //i++를 하지 않으면 1이 계속 나옴
		}*/

	}

}
