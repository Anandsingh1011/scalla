package javaCode.streem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javaCode.streem.Person.Sex;

public class StreemJ {

	public static void main(String[] args) {
		
		/*
		 * Example 1
		 */
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");

		System.out.println(myList.stream());
		
			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);
			
	   /*
	    * Example 2
	    */
			
			List<Person> person = new ArrayList<>();
			
			Person p1 = new Person("Anand", LocalDate.of(2014, Month.JANUARY, 1), Sex.MALE, 35);
			Person p2 = new Person("Hina", LocalDate.of(2014, Month.JANUARY, 1), Sex.FEMALE, 55);
			Person p3 = new Person("Jai", LocalDate.of(2014, Month.JANUARY, 1), Sex.MALE, 26);
			Person p4 = new Person("Ravi", LocalDate.of(2014, Month.JANUARY, 1), Sex.MALE, 23);
			Person p5 = new Person("Kamal", LocalDate.of(2014, Month.JANUARY, 1), Sex.MALE, 45);
			Person p6 = new Person("Tina", LocalDate.of(2014, Month.JANUARY, 1), Sex.FEMALE, 20);
			Person p7 = new Person("Williom", LocalDate.of(2014, Month.JANUARY, 1), Sex.MALE, 19);
			Person p8 = new Person("Lisa", LocalDate.of(2014, Month.JANUARY, 1), Sex.FEMALE, 25);
			
			person.add(p1);
			person.add(p2);
			person.add(p3);
			person.add(p4);
			person.add(p5);
			person.add(p6);
			person.add(p7);
			person.add(p8);
			
			System.out.println();
			
			person.stream()
				.filter((Person p) -> p.gender == Sex.FEMALE)
				.sorted(Person::compairAge)
				.forEach(p -> p.print());
			
			System.out.println();
			
			
			person.stream()
				.filter((Person p) -> p.gender == Sex.FEMALE)
				.sorted(Person::compairAge)
				.map(p -> p.getName())
				.forEach(n -> System.out.println(n));
		

	}
	
	

}
