// file name and public class name will be same
//only public class we can use

class A1{
	A1(){
		System.out.println("Hi constructor");
	}
	void display(){
		System.out.println("Hi method");
	}
}
public class demo{
	public static void main(String args[]){
		System.out.println("Hey java");
		A1 a = new A1();
		a.display();
	}
}