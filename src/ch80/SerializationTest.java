package ch80;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함
class Person implements Serializable{// socket 같은건 직렬화 불가능 
	//가능하게 하려면 transient를 사용하여 직렬화에서 제외 transient : 직렬화 하지 않으려는 멤버 변수에 사용함
	
	private static final long serialVersionUID = 1L;//
	
	private String name;
	private String job;
	
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
}

public class SerializationTest {

	public static void main(String[] args) {
		Person personLee = new Person("이순신", "대표이사");
		Person personKim = new Person("김유신", "상무이사");

		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial.txt"))){
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.txt"))){
			Person pLee = (Person)ois.readObject();
			Person pKim = (Person)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pKim);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("end");
	}

}
