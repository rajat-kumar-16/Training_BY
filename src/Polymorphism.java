// methos overriding is when child has the same function that its parent has, so basically signature has to be same
class B{
    // method overloading
    void B(){
	B(10);
        System.out.println("B()");
        
    }
    void B(int a){
        B(10,"Rajat");
        System.out.println("B(int a) ");
    }
    void B(int a, String name){
        System.out.println("B(int a, String name)");
    }
}
class A{
    // constructor overloading
    A(){
	this(10); //to call another constructor in same class
        System.out.println("A()");
    }

    A(int a){
        System.out.println("A(int a) ");
    }
    A(int a, String name){
        System.out.println("A(int a, String name)");
    }
}
class Polymorphism{
    public static void main(String args[]){
        A a=new A();
        A a1=new A(10);
        A a2= new A(10, "Rajat");
        B b= new B();
	b.B();
    }
}