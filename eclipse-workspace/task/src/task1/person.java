package task1;

public class person {
	private String name;
	private int age;
	private String gender;
	private double tall;
	private double weight;

	public person() {
		// TODO Auto-generated constructor stub
	}

	public person(String name, int age, String gender, double tall, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.tall = tall;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " + age + ", " + gender + ", " + tall + ", " + weight;

	}

}
