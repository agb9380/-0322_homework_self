package s0322;

public class Triangle extends Shape {
	
	@Override
	public void info(int a, int b) {
		System.out.println("밑변 " + a + ", 높이 " + b + "의 삼각형의 면적은 " + (int) (a * b * 0.5) + "입니다.");
	}
}
