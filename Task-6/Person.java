package day11;

public class Person {
	private String name;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		Person obj= new Person("Santhosh",25);
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

}