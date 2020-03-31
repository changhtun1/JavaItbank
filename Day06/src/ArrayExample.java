import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		
		// 1. 배열 변수의 선언.
//		int[] arr; //java
		
		// 2. 배열 객체의 생성 - 실제 값들이 저장될 공간을 형성.
//		arr = new int[5]
				
		int[] arr = new int[5];
		
		// 3. 배열의 초기화 - 배열 내부에 실제 값들을 저장.
		// 배열의 초기화는 인덱스를 통해 수행합니다.
		// 인덱스란 배열 내부의 위치를 지정하는 값입니다.
		// 인덱스는 0번부터 시작하여 1씩 순차적으로 증가합니다.
		arr[0] = 65;
		arr[1] = 88;
		arr[2] = arr[0];
		arr[3] = (int) 3.14;
//		arr[4] = "못들어갑니다";
		arr[4] = 100;
//		arr[5] = 77;  인덱스 범위 초과
		
		// 4. 배열의 총 크기(길이) 확인 -> 배열변수명.length
		System.out.println("배열 길이:"+arr.length);
		// 5. 배열에 저장된 값을 참조 하는법
		System.out.println("배열의 1번째 데이터:"+arr[0]);
		System.out.println("배열의 2번째 데이터:"+arr[1]);
		System.out.println("배열의 3번째 데이터:"+arr[2]);
		System.out.println("배열의 4번째 데이터:"+arr[3]);
		System.out.println("배열의 5번째 데이터:"+arr[4]);
		
		// 6. 배열의 반복문 처리
		System.out.println("----------------------------");
		for(int idx=0; idx<arr.length; idx++) {
			System.out.println(arr[idx]);
		}
		
		// 7. 배열내부의 요소값을 문자열 형태로 한눈에 출력하기
		System.out.println(Arrays.toString(arr));
		
		// 8. 배열의 선언과 생성을 동시에 하기
		
		double[] dArr = new double[3];
		String[] sArr = new String[4];
		byte[] bArr = new byte[10];
		
		System.out.println("-------------------------------");
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));
		System.out.println("-------------------------------");

		
		// 9. 배열의 생성과 동시에 초기화도 진행하는 방법.
		char[] letters = new char[] {'A','B','C','D'};
		System.out.println(Arrays.toString(letters));
		
		// 10. 선언과 동시에 초기화할 떄
		// 딱 1번만 가능한 문법.
		String[] names = {"홍길동","고길동","박길동"};
		System.out.println(Arrays.toString(names));
		
	}

}
