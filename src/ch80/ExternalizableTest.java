package ch80;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Person1 implements Externalizable{
	
	private String name;
	private String job;
	
	public Person1() {}
	
	public Person1(String name, String job) {
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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeUTF(name);
		out.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		job = in.readUTF();
	}
	
}

public class ExternalizableTest {

	public static void main(String[] args) {
		Person1 personLee = new Person1("이순신", "대표이사");
		Person1 personKim = new Person1("김유신", "상무이사");

		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial1.txt"))){
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial1.txt"))){
			Person1 pLee = (Person1)ois.readObject();
			Person1 pKim = (Person1)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pKim);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("end");
	}

}
