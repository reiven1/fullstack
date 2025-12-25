package task1;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<person> list = new ArrayList<person>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("이름 : ");
			String name = scanner.next();
			System.out.print("나이 : ");
			int age = scanner.nextInt();
			System.out.print("성별 : ");
			String gender = scanner.next();
			System.out.print("키 : ");
			double tall = scanner.nextDouble();
			System.out.print("몸무게 : ");
			double weight = scanner.nextDouble();

			list.add(new person(name, age, gender, tall, weight));

			System.out.print("1. 계속입력 | 2. 종료 (숫자입력) : ");
			int num = scanner.nextInt();

			if (num == 2)
				break;
		}

		personService ps = new personService();

		System.out.println("1. 전체 출력");
		ps.print(list);
		System.out.println("2. 키 180 이상 나이 +1");
		ps.incAgeTall180Over(list);
		System.out.println("3. 나이 40 이상만 출력");
		ps.printAgeOver40(list);
		System.out.println("4. 이름 내림차순 정렬");
		ps.sortNameDesc(list);
		System.out.println("5. 키 오름차순 정렬");
		ps.sortTallAsc(list);
		System.out.println("6. 2번 인덱스에 최주영 추가");
		ps.addIndex2(list);
		System.out.println("7. 3번 인덱스를 이동제로 변경");
		ps.setIndex3(list);
		System.out.println("8. 고길동 없으면 추가");
		ps.addGoGilDong(list);
		System.out.println("9. 선덕여왕 위치에 주몽 추가");
		ps.addJumong(list);
		System.out.println("10. 4번 인덱스 삭제");
		ps.removeIndex4(list);
		System.out.println("11. 김두환 삭제");
		ps.removeKimDuhwan(list);
		System.out.println("12. 리스트 비었는지 확인");
		ps.checkEmpty(list);
		System.out.println("13. 전체 삭제");
		ps.clearAll(list);
		
		scanner.close();
	}

}
