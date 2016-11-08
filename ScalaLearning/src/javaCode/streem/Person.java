package javaCode.streem;

import java.time.LocalDate;

public class Person {

	public Person(String name, LocalDate birthday, Sex gender, int age) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.age = age;
	}

	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.println(
				"Person [name=" + name + ", birthday=" + birthday + ", gender=" + gender + ", age=" + age + "]");
	}

	public static int compairAge(Person p1, Person p2) {
		return Integer.compare(p1.age, p2.age);
	}

}
