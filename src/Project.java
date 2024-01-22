import java.util.*;
interface Company{
    void access();
    //In java 8 default/static methods are allowed in interface instead of just being abstract methods
    String Company_name="Blue Yonder"; // by default, it is public static final
}
abstract class Emp{
    Scanner sc= new Scanner(System.in);
    public int id,age;
    public String name;
    private float salary;
    private StringBuffer designation =new StringBuffer();
    int raise;

    void setSalary(float salary){
        this.salary=salary;
    }
    float getSalary(){
       return this.salary;
    }
    void setDesignation(String designation){
        StringBuffer s1=new StringBuffer(designation);
        this.designation=s1;
    }
    String getDesignation(){
        return this.designation.toString();
    }
    void assign(){

        System.out.print("Enter Id:");
        id=sc.nextInt();

        System.out.print("Enter name:");
        name=sc.next();
        System.out.print("Enter age:");
        age=sc.nextInt();
    }

    void display(){
        if(id == 0)
            System.out.println("No one here :)");
        else{
            System.out.println(" ");
            System.out.println(Company.Company_name);
            System.out.println("Id:"+id);
            System.out.println("name:"+name);
            System.out.println("age:"+age);
            System.out.println("salary:"+salary);
            System.out.println("designation:"+designation);
        }
    }
    void raiseSalary(){
        salary= salary + (raise*salary)/100;
        raise=0; // to stop the increasing, also it will be 0 for certain child.
    }
}


final class Developer extends Emp implements Company{

    Developer(){
        setSalary(50000);

        setDesignation("Developer");
        raise=15;
    }
    public void access(){
        if(id == 0)
            System.out.println("No one here :)");
        else{
            System.out.println("access for developer: A");
        }
    }
}

final class Clerk extends Emp implements Company{

    Clerk(){
        setSalary(10000);
        setDesignation("Clerk");
        raise=5;
    }
    public void access(){
        if(id == 0)
            System.out.println("No one here :)");
        else{
            System.out.println("access for Clerk: C" );
        }

    }
}


final class Manager extends Emp implements Company{

    Manager(){
        setSalary(70000);
        setDesignation("Manager");
        raise=20;
    }
    public void access(){
        if(id == 0)
            System.out.println("No one here :)");
        else{
            System.out.println("access for Manager: A and B");
        }
    }
}


final class Tester extends Emp implements Company{
    Tester(){
        setSalary(25000);
        setDesignation("Tester");
        raise=10;
    }
    public void access(){
        if(id == 0)
            System.out.println("No one here :)");
        else{
            System.out.println("access for Tester: B");
        }
    }

}


class project{


    static int d=0;
    static int c=0;
    static int m=0;
    static int t=0;
    static Developer da[]=new Developer[5];
    static Clerk ca[]= new Clerk[5];
    static Manager ma[]= new Manager[5];
    static Tester ta[]= new Tester[5];
//    static Developer d= new Developer();
//    static Clerk c= new Clerk();
//    static Manager m= new Manager();
//    static Tester t= new Tester();

    public static void main(String[] args){
        try{
            int opt1=0;
            Scanner sc= new Scanner(System.in);
            while(opt1!=5){
                System.out.println("1) Create");
                System.out.println("2) Display");
                System.out.println("3) Raise salary");
                System.out.println("4) Access");
                System.out.println("5) EXIT");
                opt1=sc.nextInt();

                if(opt1 == 1){
                    CreateDisplay(opt1);
                }
                if(opt1 == 2){
                    CreateDisplay(opt1);
                }
                if(opt1 == 3){
                    CreateDisplay(opt1);
                }
                if(opt1 == 4){
                    CreateDisplay(opt1);
                }
                if(opt1 == 5){
                    System.out.println("Thanks a lot!");
                    System.exit(0);
                }

            }
        }
        catch(Exception e){
            System.out.println("Enter a valid choice ");
        }

    }

    static void CreateDisplay(int opt1){
        try{
            int opt2=0;
            Scanner sc= new Scanner(System.in);
            while(opt2!=5) {
                System.out.println(" ");
                if (opt1 == 1)
                    System.out.println("Options for Create:");
                if (opt1 == 2)
                    System.out.println("Options for Display:");
                if (opt1 == 3)
                    System.out.println("Options for Raise Salary:");
                if (opt1 == 4)
                    System.out.println("Options for Access:");

                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Manager");
                System.out.println("4) Tester");
                System.out.println("5) EXIT");

                System.out.print("Choose the option... :");
                opt2 = sc.nextInt();
                if (opt2 == 1) {
                    if (opt1 == 1){

                        if(d==5){
                            System.out.println(" ");
                            System.out.println("i need Space bro");
                        }else{
                            da[d]=new Developer();
                            da[d].assign();
                            d++;
                        }

                    }
                    if (opt1 == 2){
                        for(int dis=0;dis<5;dis++){
                            da[dis].display();
                        }
                    }
                    if (opt1 == 3)
                        for(int rs=0;rs<5;rs++)
                            da[rs].raiseSalary();
                    if (opt1 == 4)
                        da[0].access();

                }
                if (opt2 == 2) {
                    if (opt1 == 1){
                        if(c==5){
                            System.out.println(" ");
                            System.out.println("i need Space bro");
                        }else{
                            ca[c]=new Clerk();
                            ca[c].assign();
                            c++;
                        }

                    }
                    if (opt1 == 2)
                        for(int dis=0;dis<5;dis++){
                            ca[dis].display();
                        }
                    if (opt1 == 3)
                        for(int rs=0;rs<5;rs++)
                            ca[rs].raiseSalary();
                    if (opt1 == 4)
                        ca[0].access();
                }
                if (opt2 == 3) {
                    if (opt1 == 1){
                        if(m==5){
                            System.out.println(" ");
                            System.out.println("i need Space bro");
                        }
                        else{
                            ma[m].assign();
                            ma[m]=new Manager();
                            m++;
                        }
                    }
                    if (opt1 == 2)
                        for(int dis=0;dis<5;dis++){
                            ma[dis].display();
                        }
                    if(opt1 == 3)
                        for(int rs=0;rs<5;rs++)
                            ma[rs].raiseSalary();
                    if (opt1 == 4)
                        ma[0].access();

                }
                if (opt2 == 4) {
                    if (opt1 == 1){
                        if(t==5){
                            System.out.println(" ");
                            System.out.println("i need Space bro");
                        }
                        else{
                            ta[t].assign();
                            ta[t]=new Tester();
                            t++;
                        }
                    }
                    if (opt1 == 2)
                        for(int dis=0;dis<5;dis++){
                            ta[dis].display();
                        }
                    if (opt1 == 3)
                        for(int rs=0;rs<5;rs++)
                            ta[rs].raiseSalary();
                    if (opt1 == 4)
                        ta[0].access();


                }
                if (opt2 == 5) {
                    System.out.println("Thanks a lot!");
                }
            }
        }
        catch(Exception e){
            System.out.println("Choose valid option please...");
        }
    }
}
