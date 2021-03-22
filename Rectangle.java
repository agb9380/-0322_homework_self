package s0322;

public class Rectangle extends Shape {

	@Override
	public void info(int a, int b) {
		System.out.println("가로 " + a + ", 세로 " + b + "의 직사각형 면적은 " + a * b + "입니다.");
	}

}