package ch09_class.nextt.commans;

//유용한 메소드들을 가지고 있는 클래스

public class UtillClass {

	//ch06_method / MethodMain 에서 했던 weRound 

	//반올림 메소드
		public static double weRound(double num, int n) {
			//Math.round() 은 소수 첫째자리에서
			//반올림한 정수를 리턴
			//3.141592 에 Math.round(3.141592) 를 하면
			//3이 된다. 3.1로 만들고 싶다면?
			
			// 3.141592에 10을 곱한다 -> 31.41595
			//Math.round(31.41592) -> 31
			//31을 10으로 나눈다 -> 3.1
			
			//3.141592에 100을 곱한다 -> 314.1592
			//Math.round(314.1592) -> 314
			//314를 100으로 나눈다 -> 3.14
			
			//10의 n 제곱 구하기
			//Math.pow(10, n);
			int ten = 1;
			for(int i = 0; i < n; i++) { //n회 반복되는 for문
				ten *=10;
			}
			
			num = num * ten;
			long temp = Math.round(num);
			
			double result = (double)temp / ten;
			
			return result;
		}
	
}
