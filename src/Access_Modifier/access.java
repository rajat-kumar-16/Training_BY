package Access_Modifier;
//import P2.check;
public class access {

    public int a=100; // anywhere
    private int b=200; //in the class only
    protected  int c=300; // in the package and child or sub child of class only
    int d=400; // in the package only
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
class modifier1 extends access{
    void display(){
        System.out.println(a);
        //System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class object{
    public static void main(String[] args){
        display();
    }
    public static void display(){
        access a=new access();
        System.out.println(a.a);
        //System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
    }
}
