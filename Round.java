package s0322;

public class Round extends Shape {

	@Override
	public void info(int a, int b) {
		b = a;
		System.out.println("반지름이 " + a + "인 원의 면적은 " + a * b * Shape.PI + "입니다.");
	}
}
