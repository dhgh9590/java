
public class VarEx1 {

	public static void main(String[] args) {
		//변수 값을 저장하기 위해서는 변수 타입과 할당값이 일치 해야 함
		int num1 = 6, num2 = 3; //변수 값 저장 /int 값의 최대값은 20억
		int num3 = num1 + num2; //저장된 변수 더하기
		char ch = '가'; //문자 저장
		String ch2 = "가나다라"; //문자열 저장
		final int num4 = 10; //상수 저장
		boolean check = true; //true,false 저장
		byte num5 = 127;//byte는 -128 ~ 127 까지만 저장
		long num6 = 10_000_000L; //20억이 넘는다면 long 타입으로 저장 / 접미사 L을 붙여야 함 / _는 알아보기 싶게 하기위해 추가됨
		float num7 = 3.14f; //실수형 / 접미사 f를 넣어줘야함 / f는 생략 불가
		double num8 = 3.14d; //실수형 / 접미사 d는 생략 가능 / 접미사가 안붙으면 더블타입
	}

}
