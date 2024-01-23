import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
import java.sql.*;
interface Company{
    //In java 8 default/static methods are allowed in interface instead of just being abstract methods
    String Company_name="Blue Yonder"; // by default, it is public static final
}
abstract class Emp{
    Scanner sc= new Scanner(System.in);
    public int id,age;
    public String name;
    private float salary;
    private StringBuffer designation =new StringBuffer();

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

        try{
            Scanner sc =new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/BlueYonder","root","root");
            System.out.print("Enter Id:");
            id=sc.nextInt();

            System.out.print("Enter name:");
            name=sc.next();
            System.out.print("Enter age:");
            age=sc.nextInt();
            PreparedStatement pstmt=con.prepareStatement("insert into employee values(?, ? , ? , ? , ? )");
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.setInt(3,age);
            pstmt.setFloat(4,salary);
            pstmt.setString(5,designation.toString());
            pstmt.execute();
            pstmt.close();
            con.close();

        }catch(Exception e) {

        }
    }
    boolean displayById(int did){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/BlueYonder","root","root");
            PreparedStatement pstmt=con.prepareStatement("Select * from employee where id = ?");
            pstmt.setInt(1,did);
            ResultSet rs=pstmt.executeQuery();
            System.out.println(" ");
            ResultSetMetaData r1 = rs.getMetaData();
            int size=0;
            PreparedStatement pstmttmp=con.prepareStatement("Select * from employee where id = ? ");
            pstmttmp.setInt(1,did);
            ResultSet rstmp=pstmttmp.executeQuery();
            while(rstmp.next()){
                size++;
            }
            if(size==0){
                System.out.println("No one here");
                return false;
            }else{
                System.out.println(r1.getColumnName(1) + ": "+r1.getColumnName(2) +": "+r1.getColumnName(3)+": "+r1.getColumnName(4)+": "+r1.getColumnName(5));
//                rs=rstmp;
                while(rs.next()){
                    System.out.println(rs.getInt(1)+": "+rs.getString(2)+": "+rs.getInt(3)+": "+rs.getFloat(4)+": "+rs.getString(5));
                }
            }
            rstmp.close();
            rs.close();
            pstmt.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return true;
    }
    void display(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/BlueYonder","root","root");
            PreparedStatement pstmt=con.prepareStatement("Select * from employee where designation =  ? ");
            pstmt.setString(1,designation.toString());
            ResultSet rs=pstmt.executeQuery();
            System.out.println(" ");
            System.out.println(Company.Company_name);
            ResultSetMetaData r1 = rs.getMetaData();

            int size=0;
            PreparedStatement pstmttmp=con.prepareStatement("Select * from employee where designation =  ? ");
            pstmttmp.setString(1,designation.toString());
            ResultSet rstmp=pstmttmp.executeQuery();
            while(rstmp.next()){
                size++;
            }
            if(size==0){
                System.out.println("No one here");
            }else{
                System.out.println(r1.getColumnName(1) + ": "+r1.getColumnName(2) +": "+r1.getColumnName(3)+": "+r1.getColumnName(4)+": "+r1.getColumnName(5));
//                rs=rstmp;
                while(rs.next()){
                    System.out.println(rs.getInt(1)+": "+rs.getString(2)+": "+rs.getInt(3)+": "+rs.getFloat(4)+": "+rs.getString(5));
                }
            }
            rstmp.close();
            rs.close();
            pstmt.close();
        }catch(Exception e){
        }
    }
    void updateSalary(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/BlueYonder","root","root");
            PreparedStatement pstmt=con.prepareStatement("Update employee set salary = ? where id =  ? ");
            System.out.print("Enter the id: ");
            int sid=sc.nextInt();
            System.out.print("Enter the amount you want to increase: ");
            float ssalary=sc.nextFloat();
            salary= salary + ssalary;
            System.out.println(salary);
            pstmt.setFloat(1,salary);
            pstmt.setInt(2,sid);
            pstmt.execute();
            pstmt.close();
        }catch(Exception e){
        }
        // to stop the increasing, also it will be 0 for certain child.
    }

    void delete(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/BlueYonder","root","root");
            PreparedStatement pstmt=con.prepareStatement("Delete from employee where id = ? ");
            System.out.print("Enter the id you want to delete: ");
            int did =sc.nextInt();
            if(!displayById(did)){
                return;
            }
            System.out.print("Are you sure   ");
            pstmt.setInt(1,did);
            String resp=sc.next();
            if(resp.equalsIgnoreCase("Y") || resp.equalsIgnoreCase("yes"))
                pstmt.execute();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
final class Developer extends Emp implements Company{

    Developer(){
        setSalary(50000);

        setDesignation("Developer");
    }
}
final class Clerk extends Emp implements Company{

    Clerk() {
        setSalary(10000);
        setDesignation("Clerk");
    }
}
final class Manager extends Emp implements Company{

    Manager(){
        setSalary(70000);
        setDesignation("Manager");
    }
}
final class Tester extends Emp implements Company{
    Tester(){
        setSalary(25000);
        setDesignation("Tester");
    }
}
class project{
    static ArrayList<Employee> emp = new ArrayList<Employee>();
    static Developer d=new Developer();
    static Clerk c= new Clerk();
    static Manager m= new Manager();
    static Tester t= new Tester();
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
                System.out.println("3) Update salary");
                System.out.println("4) Delete");
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
                    System.out.println("Options for Update Salary:");
                if (opt1 == 4)
                    System.out.println("Options for Delete:");

                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Manager");
                System.out.println("4) Tester");
                System.out.println("5) EXIT");

                System.out.print("Choose the option... :");
                opt2 = sc.nextInt();
                if (opt2 == 1) {
                    if (opt1 == 1){
                        d.assign();
                    }
                    if (opt1 == 2){
                        d.display();
                    }
                    if (opt1 == 3)
                        d.updateSalary();
                    if (opt1 == 4)
                        d.delete();
                }
                if (opt2 == 2) {
                    if (opt1 == 1){
                        c.assign();
                    }
                    if (opt1 == 2)
                        c.display();
                    if (opt1 == 3)
                        c.updateSalary();
                    if (opt1 == 4)
                        c.delete();
                }
                if (opt2 == 3) {
                    if (opt1 == 1){
                        m.assign();
                    }
                    if (opt1 == 2)
                        m.display();
                    if(opt1 == 3)
                        m.updateSalary();
                    if (opt1 == 4)
                        m.delete();

                }
                if (opt2 == 4) {
                    if (opt1 == 1){
                        t.assign();
                    }
                    if (opt1 == 2)
                        t.display();
                    if (opt1 == 3)
                        t.updateSalary();
                    if (opt1 == 4)
                        t.delete();


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