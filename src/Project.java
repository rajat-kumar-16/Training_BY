import java.util.Scanner;
interface Company{
    void access();
    //In java 8 default/static methods are allowed in interface instead of just being abstract methods
    String Company_name="Blue Yonder"; // by default, it is public static final
}
abstract class Emp{
    Scanner sc= new Scanner(System.in);
    int id,age;
    String name;
    float salary;
    String designation;
    int raise;

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
        salary=50000;
        designation="Developer";
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
        salary=10000;
        designation="Clerk";
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
        salary=70000;
        designation="Manager";
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
        salary=25000;
        designation="Tester";
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

    static Developer d= new Developer();
    static Clerk c= new Clerk();
    static Manager m= new Manager();
    static Tester t= new Tester();

    public static void main(String[] args){
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

    static void CreateDisplay(int opt1){
        int opt2=0;
        Scanner sc= new Scanner(System.in);
        while(opt2!=5){
            System.out.println(" ");
            if(opt1==1)
                System.out.println("Options for Create:");
            if(opt1==2)
                System.out.println("Options for Display:");
            if(opt1==3)
                System.out.println("Options for Raise Salary:");
            if(opt1==4)
                System.out.println("Options for Access:");

            System.out.println("1) Developer");
            System.out.println("2) Clerk");
            System.out.println("3) Manager");
            System.out.println("4) Tester");
            System.out.println("5) EXIT");

            System.out.print("Choose the option... :");
            opt2 = sc.nextInt();
            if(opt2 == 1){
                if(opt1==1)
                    d.assign();
                if(opt1==2)
                    d.display();
                if(opt1==3)
                    d.raiseSalary();
                if(opt1==4)
                    d.access();

            }
            if(opt2 == 2){
                if(opt1==1)
                    c.assign();
                if(opt1==2)
                    c.display();
                if(opt1==3)
                    c.raiseSalary();
                if(opt1==4)
                    c.access();


            }
            if(opt2 == 3){
                if(opt1==1)
                    m.assign();
                if(opt1==2)
                    m.display();
                if(opt1==4)
                    m.access();

            }
            if(opt2 == 4){
                if(opt1==1)
                    t.assign();
                if(opt1==2)
                    t.display();
                if(opt1==3)
                    t.raiseSalary();
                if(opt1==4)
                    t.access();


            }
            if(opt2== 5){
                System.out.println("Thanks a lot!");
            }
        }
    }
}