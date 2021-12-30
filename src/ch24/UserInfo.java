package ch24;
//키가 180 이고 몸무게가 78 킬로인 남성이 있습니다. 이름은 Tomas 이고 나이는 37세입니다.
public class UserInfo {
	
	private int height, weight, age;
	private String name;
	
	public UserInfo() {//기본생성자
		super();
	}

	public UserInfo(int height, int weight, int age, String name) {//오버로딩 생성자
		super();
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.name = name;
	}
//get,set 메서드
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {//toString 메서드 (오버라이딩)
		return "UserInfo [height=" + height + ", weight=" + weight + ", age=" + age + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
}
