package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsMinMax {

	public static void main(String[] args) {
		//Get min or max number
		Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
				                  .max(Comparator.comparing(Integer::valueOf))
				                  .get();
		
		Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
		System.out.println("maxNumber =" + maxNumber);
		System.out.println("minNumber =" + minNumber);
		
		//Find max or min object by object property
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Will", 24));
		employees.add(new Employee(2, "Alex", 46));
		employees.add(new Employee(3, "Brain", 52));
		employees.add(new Employee(3, "Duane", 26));
		
		Comparator<Employee> comparator = Comparator.comparing(Employee:: getAge);
		
		//Get Minimum or Max Object
		Employee minObject = employees.stream().min(comparator).get();
		Employee maxObject = employees.stream().max(comparator).get();
		
		System.out.println("minObject : " + minObject);
		System.out.println("maxObject : " + maxObject);
		
		
		//boolean anyMatch = employees.stream().anyMatch(employee-> (e.getAge().anyMatch > 50));
		//System.out.println("any Match: " + anyMatch);
		
	}

}
class Employee {
	private int id;
	private String name;
	private int age;
	
	public Employee(int id , String name , int age) {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
}
