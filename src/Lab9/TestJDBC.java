package Lab9;

import java.sql.*;
import java.util.ArrayList;

public class TestJDBC {
    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver load successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String SQCONN = "jdbc:sqlite:RUTS.sqlite";
        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            if (conn == null){
                System.out.println("Could not connect to database.");
            }else {
                System.out.println("Connected to database.");
            }

            //step3
            Statement stmt = conn.createStatement();
            String sql = "select * from student";
            ResultSet rs = stmt.executeQuery(sql);

            //step4
             if (rs == null){
                 System.out.println("Could not found any data.");
             }else {
                 System.out.println("Student data from database:");
                 ArrayList<Student> std = new ArrayList<>();
                 while (rs.next()){
//                     System.out.println("####################");
//                     System.out.println("SID:"+rs.getInt(1));
//                     System.out.println("Name:"+rs.getString(2));
//                     System.out.println("Major:"+rs.getString(3));
//                     System.out.println("GPA"+rs.getDouble(4));
                     Student s = new Student(rs.getInt(1),
                             rs.getString(2),
                             rs.getString(3),
                             rs.getDouble(4));
                     //
                     std.add(s);
                 }//while
                 //
                 DisplayObject(std);
             }

             //stap5
            rs.close();
             stmt.close();
             conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void DisplayObject(ArrayList<Student> std) {

        for (Student s:std) {
            System.out.println(s.toString());
        }
    }

}
