package reference;

import java.util.Scanner;

public class CompareStr {

	public static void main(String[] args) {
		
		String str1 ="홍길동";
		String str2 = new String("홍길동");
		
		System.out.println(str1==str2);

				
		User kim =new User("abc1234");
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호를 입력하세요:");
		String password = sc.next();
		
		System.out.println("내가 방금 입력한 비번:"+password);
		System.out.println("가입 당시 생성한 비번:"+kim.pw);
		
		System.out.println("-----------------------------");
		
		System.out.println("==연산자의 결과:" +(password==kim.pw));
		System.out.println("equals 연산자의 결과:"+(password.equals(kim.pw)));
		
		
		
		
		
		
		
		

	}

}
