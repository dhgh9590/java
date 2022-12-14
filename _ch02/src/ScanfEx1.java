//화면으로 부터 값 입력 받기
import java.util.*; //*은 모든 클래스를 사용 가능 / Scanner 이라고 지정하면 지정된 클래스만 사용가능

public class ScanfEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println(num);
	}

}
