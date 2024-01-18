//static things can be access throughout the classs but outside the class they are called using class's name
//without making any objects
class A2{
    static int x=100;

    static void abc(String name){
        System.out.println("Name "+name);
    }
}
class Static{
    public static void main(String args[]){
        System.out.println(A2.x);
        A2.abc("Rajat");
    }
}