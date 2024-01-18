//if we want to make a method abstract, we have to make class also abstract
//if parent class is abstract then you have to make a body for all the abstract methods in non-abstract child class
//we can make constructor for the abstract class but can't create object for that.

abstract class Bank{
	abstract void loan();
	void roi(){
		System.out.println("I am abstract class's simple method");
	}
}
class Sbi extends Bank{
	void loan(){
		System.out.println("I am abstract class's abstract method in SBI");
	}
}
class abstraction{
	public static void main(String args[]){
		Sbi b= new Sbi();
		b.loan();
		b.roi();
	}
}