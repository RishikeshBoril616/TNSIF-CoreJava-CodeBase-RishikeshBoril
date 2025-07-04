package HierarchicalInheritance;

public class HierarchicalDriver {
	public static void main(String[] args) {
		
		
		person p1=new person();
		System.out.println("------Person Details ------");
		System.out.println(p1);
		
		System.out.println("--------------------------");
		//Student s=new Student();
		person p;
		p=new person("Rishikesh", "Nashik");
		System.out.println("Person Details "+ p);
		
		p=new student("Hariom", "Mumbai", "TE", 67.89f);
		System.out.println("Students details "+ p);
		
		p=new employee("Vijay", "Buldana", 1002, 450000, "Development");
		System.out.println("employee details "+ p);
		


		
	}
}
