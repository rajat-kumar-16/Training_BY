package database_connections;
import java.util.Scanner;
import java.sql.*;

class jdbc_connection_insert{
    public static void main(String args[]){
        try{
            Scanner sc =new Scanner(System.in);
            //mysql
            /*
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BlueYonder","root","root");
            Statement stmt =con.createStatement();
//            stmt.execute("insert into Employee values(200, 'Mahesh',25,40000,'Tester')");
            //execute for static query
            PreparedStatement dstmt = con.prepareStatement("insert into Employee values(?,?,?,?,?)");

            System.out.println("Enter Id:"); int id = sc.nextInt();
            System.out.println("Enter Name:"); String name = sc.next();
            System.out.println("Enter Age:"); int age = sc.nextInt();
            System.out.println("Enter Salary:"); float salary = sc.nextFloat();
            System.out.println("Enter Desig:"); String designation = sc.next();
            dstmt.setInt(1, id);
            dstmt.setString(2, name);
            dstmt.setInt(3, age);
            dstmt.setFloat(4, salary);
            dstmt.setString(5, designation);
            if(salary>=25000){
                dstmt.execute();
            }else{
                System.out.println("hey work on your skills man");
            }
            stmt.close();
            con.close();
            System.out.println("Great Job man!");
            */

            //psql
            /*
            Class.forName("org.postgresql.Driver");
            Connection consql=DriverManager.getConnection("jdbc:postgresql://localhost:5432/psqlby","postgres","root");
            Statement pstmt =consql.createStatement();
            pstmt.execute("insert into Employee values(200, 'Mahesh',25,40000,'Tester')");
            pstmt.close();
            consql.close();
            System.out.println("Great Job man!");
             */
            //mssql
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection consql=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=blueyonder;encrypt=true;trustServerCertificate=true","Rajat","RAJATkumar@123");
//            Connection consql = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;encrypt=true;databaseName=blueyonder;integratedSecurity=true;trustServerCertificate=true;");
            Statement pstmt =consql.createStatement();
                            // insert
//            pstmt.execute("insert into Employee values(300, 'rajat',27,30000,'Clerk')");
                            //update
//            pstmt.execute("update Employee set salary = 100000 where id = 300");
                            //delete
            PreparedStatement ppstmt = consql.prepareStatement("Delete from Employee where id = ?");
            System.out.print("Enter the id you want to delete: ");
            int id=sc.nextInt();
            System.out.println("are you sure?");
            String ch=sc.next();
            if(ch.equalsIgnoreCase("Y") || ch.equalsIgnoreCase("yes")){
                ppstmt.setInt(1,id);
                ppstmt.execute();
            }
            pstmt.close();
            ppstmt.close();
            consql.close();
            System.out.println("Great Job man!");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}  