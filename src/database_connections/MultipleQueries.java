package database_connections;

import java.sql.*;
import java.util.Scanner;

public class MultipleQueries {
    public static void main(String[] args) {
        try{
            Scanner sc =new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/BlueYonder","root","root");
            Statement stmt=con.createStatement();
            stmt.addBatch("insert into employee values(900, 'Chinmay', 23,90000, 'Developer')");
            stmt.addBatch("insert into employee values (800, 'vaibhav', 29 , 30000, 'Clerk')");
            stmt.addBatch("insert into employee values (700, 'Dhruv', 25 , 150000, 'Manager')");
            // add all the statements into batch and then execute the batch
//            String query="Delete from Employee where id = ?";
//            PreparedStatement pstmt=con.prepareStatement(query);
//            for(int i=0;i<3;i++){
//                int a= sc.nextInt();
//                pstmt.setInt(1,a);
//                pstmt.addBatch();
//            }
//            pstmt.executeBatch();

            stmt.executeBatch();
            stmt.close();
            con.close();
            System.out.println("enough of this man!");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
