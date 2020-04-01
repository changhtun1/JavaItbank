/*
 # 반환값, 반환 유형(return value, return type)
 
 1. 반환값이란 메서드의 실행 결과값을 의미합니다.
 
 2. 매개변수는 여러 개 존재할 수 있지만,
  반환값은 오직 한 개만 존재해야함
  
 3. return이라는 키워드를 사용하며 return 뒤에 전달할 값을 지정합니다.
 
 4. 전달되는 값의 데이터 타입을 반환 유형이라고 하며, 메서드를 선언할 때
 메서드 이름 앞에 반드시 반환 유형을 명시해야 합니다.
 
 5. 반환값이 있는 메서드는 호출문이 하나의 값으로 처리 될 수 있기 때문에
 반환값을 다른 변수에 대입할 수 도 있고, 다른 메서드의 매개값으로도 사용이 가능합니다.
 
 6. 모든 메서드가 반환 유형이 있는 것은 아닙니다. 메서드 실행 후에
 반환할 값이 딱히 없다면 return 을 사용하지 않아도 됩니다.
 
 7. 이 때는 반환유형을 메서드 선언시에 비워두지 마시고, 반드시
 void라는 키워드를 작성해 주셔야 합니다.
 
 */


public class MethodExample3 {
	
	static int add(int n1, int n2) {
		return n1+n2;
	}

	static int[] operateTotal(int n1, int n2) {
		return new int[] {add(n1,n2),n1-n2,n1*n2,n1/n2};
	}
	
	static double[] calcArrayTotal(int[] arr) {
		int sum=0;
		for(int i : arr) {
			sum+=i;
		}
		double avg=(double)sum/arr.length;
		return new double[] {sum,avg};
	}
	
	static void multi(int n1, int n2) {
		int result = n1*n2;
		System.out.printf("%d x %d = %d\n",n1,n2,result);
	}
	
	
	public static void main(String[] args) {
		
		int r1 = add(3,8); //int r1 = 11;
		int r2 = add(10,15); 
		int r3 = add(add(4,6),add(7,8));
		
		int[] totalResult = operateTotal(30, 6);
//		System.out.println(Arrays.toString(totalResult));
		
		
		/*
		 1. 메서드 이름은 calcArraytotal 이라고 통일하겠습니다.
		 2. 이 메서드는 정수 배열 하나를 전달받아 해당 배열내부에 있는
		 모든 정부의 합계(int)와 평균(double)을 '배열'에 담아서 리턴하는 메서드
		 3. 2번에 정의된 메서드를 선언하시고 ,실제로 호출해서 합계와 평균 (소수점 둘째자리까지)
		 */
		
		double[] result = calcArrayTotal(new int[] {57,89,78,91,93,47});
		System.out.println("배열의 합계:"+(int)result[0]);
		System.out.printf("배열의 평균:%.2f",result[1]);
		
		
		System.out.println("------------------------------");
		multi(10,7);
//		int r4 = numti(10,7); (x)		
		
		/*
		 - 반환 값이 없는 void타입의 메서드는 값이 돌아오지 않기 때문에
		 실행 결과를 변수에 저장할 수 없습니다.
		 
		 - 반드시 단독 호출하여 사용해야 합니다.
		 - void메서드는 단순히 동작을 지시하는 역할을 수행합니다.
		 
		 */
	}

}