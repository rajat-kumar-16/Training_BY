package database_connections;

import java.sql.*;
import java.util.*;
public class jdbc_readrecord {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BlueYonder","root","root");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from employee");
            ResultSetMetaData r1 = rs.getMetaData();// it will give us all the information about columns and table
            DatabaseMetaData d1=con.getMetaData(); // it will give us all the information about database like url, username etc.
            System.out.println(d1.getDriverName()+" "+d1.getURL());
            System.out.println(r1.getColumnName(1) + ": "+r1.getColumnName(2) +": "+r1.getColumnName(3)+": "+r1.getColumnName(4)+": "+r1.getColumnName(5));
            while(rs.next())
            {

                System.out.println(rs.getInt(1)+": "+rs.getString(2)+": "+rs.getInt(3)+": "+rs.getFloat(4)+": "+rs.getString(5));
            }

            rs.close();
            stmt.close();
            con.close();
            System.out.println("enough of this man!");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}