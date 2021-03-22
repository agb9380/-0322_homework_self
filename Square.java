package s0322;

public class Square extends Rectangle {  // 직사각형을 상속받는 정사각형
	
	@Override
	public void info(int a, int b) {
		b=a;
		System.out.println("가로 " + a + "의 정사각형 면적은 " + a * b + "입니다.");
		
	}
}

