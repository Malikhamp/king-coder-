package methods;

import java.util.Arrays;

public class SortEmployees {

	public static void main(String[] args) {
		Employee[] employees = {
				new Employee("David"),
				new Employee("Earl"),
				new Employee("Max"),
				new Employee("John G")};
		System.out.println("Before Sorting Names: " + Arrays.deepToString(employees));
		Arrays.sort(employees, Employee:: nameCompare);
		System.out.println("After Sorting Names " +Arrays.deepToString(employees));
	}

}
class Employee{
	String name;
	Employee(String name){
		this.name = name;
	}
	public static int nameCompare(Employee a1, Employee a2) {
		return a1.name.compareTo(a2.name);
	}
	public String toString () {
		return name;
	}

}
