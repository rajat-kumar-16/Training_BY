//parent class's only default constructor will be called whenever child class object is made;
// child class has priority over parent's class
// if we change the value of some property of one child's it will not effect another

//parent // super // base
class Parent{
	int a=100;
	int money = 50;
	private String car="BMW" ; // only parent can use this because its a private.
	Parent(){
	}
}

//child //Sub //derived
class Child extends Parent{
	int money =100;
	Child(){
		//inside constructor we can modify the value of the parent class;
		a=10;
		System.out.println("B class "+a);
		System.out.println("Parent's Money "+super.money); 
		// if we have conflicting  name within parent and child we use super keyword for parent's class
		System.out.println("Child's Money "+money);
	}
}

public class inheritance{
	public static void main(String args[]){
		Child c = new Child();
	}
}