package in.co.rays.Collection.Sorting;

import java.util.Comparator;

public class OrderBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee obj1, Employee obj2) {
		return obj1.salary - obj2.salary;
	}
}
