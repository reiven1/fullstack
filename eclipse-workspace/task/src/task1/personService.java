package task1;

import java.util.*;

public class personService {
	public void print(ArrayList<person> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public void incAgeTall180Over(ArrayList<person> list) {
		for (person p : list) {
			if (p.getTall() >= 180) {
				p.setAge(p.getAge() + 1);
			}
		}
	}

	public void printAgeOver40(ArrayList<person> list) {
		for (person p : list) {
			if (p.getAge() >= 40) {
				System.out.println(p);
			}
		}
	}

	public void sortNameDesc(ArrayList<person> list) {
		list.sort(Comparator.comparing(person::getName).reversed());
	}

	public void sortTallAsc(ArrayList<person> list) {
		list.sort(Comparator.comparingDouble(person::getTall));
	}

	public void addIndex2(ArrayList<person> list) {
		list.add(2, new person("최주영", 26, "남", 177.3, 70.5));
		System.out.println("\n2번 인덱스에 최주영 추가");
	}

	public void setIndex3(ArrayList<person> list) {
		list.set(3, new person("이동제", 25, "남", 175.3, 68.3));
		System.out.println("\n3번 인덱스를 이동제로 변경");
	}

	public void addGoGilDong(ArrayList<person> list) {
		boolean isThere = false;
		person target = new person("고길동", 20, "남", 175.5, 70.5);
		for (int i = 0; i < list.size(); i++) {
			if (target.getName().equals(list.get(i).getName())) {
				isThere = true;
				break;
			}
		}
		if (!isThere) {
			list.add(target);
		}
	}

	public void addJumong(ArrayList<person> list) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals("선덕여왕")) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			list.add(index, new person("주몽", 58, "남", 189.4, 90.3));
		}
		System.out.println("\n선덕여왕 위치에 주몽 추가");
	}

	public void removeIndex4(ArrayList<person> list) {
		if (list.size() <= 4) {
			System.out.println("리스트 크기가 작아서 4번 인덱스 삭제 불가");
			return;
		}
		list.remove(4);
		System.out.println("삭제 완료!");
	}

	public void removeKimDuhwan(ArrayList<person> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals("김두환")) {
				list.remove(i);
				System.out.println("김두환 삭제 완료!");
				return;
			}
		}
		System.out.println("김두환이 없습니다.");
	}

	public void checkEmpty(ArrayList<person> list) {
		if (!list.isEmpty())
			System.out.println("사람 있어요~~");
		else
			System.out.println("사람 없어요~~");
	}

	public void clearAll(ArrayList<person> list) {
		list.clear();
		System.out.println("전체 삭제 완료!");
	}

}
