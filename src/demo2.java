import java.util.Scanner;

class Employee{
	Scanner sc= new Scanner(System.in); // for taking inputs
	
	int id,age;
	float salary;
	String name, designation;
	Employee(){
		System.out.print("Enter Id:");
		id=sc.nextInt();

		System.out.print("Enter name:");
		name=sc.next(); // next will take input until the space in the input(We can use nextLine for taking the entire line)

		System.out.print("Enter age:");// ln will take us to next line
		age=sc.nextInt();
		System.out.print("Enter salary:");// ln will take us to next line
		salary=sc.nextFloat();
		System.out.print("Enter designation:");// ln will take us to next line
		designation=sc.next();
	}

	void display(){
		System.out.println("Id:"+id); // ln will take us to next line
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("salary:"+salary);
		System.out.println("designation:"+designation);
	}
}

class demo2{
	public static void main(String args[]){
		Employee e = new Employee();
		e.display();
	}
}