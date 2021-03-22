package s0322;

import java.util.Scanner;

public abstract class Shape {

	static final int PI = 3;

	public static void execution() { // 추상 클래스는 인스턴스 객체 생성이 불가능, static으로 클래스 메소드로 만들어 준 뒤, Shape.execution으로 호출함
		System.out.println("도형을 선택하세요(1.직사각형, 2.정사각형 3.삼각형, 4.원)=> ");
		Scanner sc = new Scanner(System.in);
		int selectNum = sc.nextInt();
		sc.nextLine();

		Shape s = null;

		switch (selectNum) {
		case 1: // 직사각형 메소드 호출, 묵시적 형변환
			s = new Rectangle();
//			s.info(CreateR(), CreateR()); // 하위 클래스인 Rectangle의 메소드 info() 접근
			break;
		case 2: // 정사각형 메소드 호출
			s = new Square();
//			s.info(CreateR(), CreateR());
			break;
		case 3: // 삼각형
			s = new Triangle();
//			s.info(CreateR(), CreateR());
			break;
		case 4: // 원
			s = new Round();
//			s.info(CreateR(), CreateR());
			break;
		}

		if (s != null) { // 1,2,3,4를 넣으면 s에 값이 할당되어 null값이 아니니까
			s.info(CreateR(), CreateR()); // switch문에서 각 도형마다 무작위값을 할당하는 메소드를 실행시켰다가 수정함
		} else {
			System.out.println("잘못 선택하셨습니다.");

		}

	}

	public static int CreateR() { // execution() 클래스 메소드에서는 인스턴스 멤버에 접근할 수 없기 때문에 static을 붙여서 접근 가능하도록 만듦
		int randomNum = (int) ((Math.random() * (10 - 2)) + 2);
		return randomNum;
	}

	public abstract void info(int a, int b); // 각각의 도형을 출력

}