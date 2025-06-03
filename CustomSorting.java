package com.CollectionFramework;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

class Sorting implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {

		String name1=e1.getName();
		String name2=e2.getName();

		if(name1.equalsIgnoreCase(name2))
		{
			Integer sal1=e1.getSalary();
			Integer sal2=e2.getSalary();

			if(sal1.equals(sal2))
			{
				String dept1=e1.getDept();
				String dept2=e2.getDept();

				if(dept1.equalsIgnoreCase(dept2))
				{
					Integer id1=e1.getId();
					Integer id2=e2.getId();

					return id1.compareTo(id2);
				}
				else
				{
					return dept1.compareTo(dept2);
				}
			}
			else
			{
				return sal1.compareTo(sal2);
			}
		}
		else
		{
			return name1.compareTo(name2);
		}

	}

}
class Employee
{
	private int id;
	private String name;
	private int salary;
	private String dept;

	public Employee(int id, String name,int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary;
	}
}
public class CustomSorting {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number of Employee Objects: ");
		int n=scan.nextInt();
		scan.nextLine();
		Sorting s=new Sorting();;
		TreeSet<Employee> set=new TreeSet<Employee>(s);

		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter details of Employee"+i+": ");
			String details=scan.nextLine();
			String detArr[]=details.split(",");
			int id=Integer.parseInt(detArr[0]);
			String name=detArr[1];
			int salary=Integer.parseInt(detArr[2]);
			String dept=detArr[3];
			Employee e=new Employee(id,name,salary,dept);
			set.add(e);
		}
		
		Iterator cursor=set.iterator();
		
		while(cursor.hasNext())
		{
			System.out.println(cursor.next());
		}
	}
}
