package Lab9;

import java.sql.*;
import java.util.ArrayList;

public class MobileStore {
    public static void main (String[]args){

        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver load successfully.");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        String SQCONN = "jdbc:sqlite:Studio.sqlite";
        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            if (conn == null){
                System.out.println("Could not connect to database.");
            }else {
                System.out.println("Connected to database.");
            }

            //
            Statement stmt = conn.createStatement();
            String sql = "select * from MobileStore";
            ResultSet rs = stmt.executeQuery(sql);

            //
            if (rs == null){
                System.out.println("Could not found any data.");
            }else {
                System.out.println("Mobile data from database:");
                ArrayList<Mobile> std = new ArrayList<>();
                while (rs.next()){
                    System.out.println(rs.getInt(1));
                    System.out.println(rs.getInt(2));
                    System.out.println(rs.getInt(3));
                    System.out.println(rs.getDouble(4));
                    System.out.println(rs.getString(5));

                    Mobile s = new Mobile(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getDouble(4),
                            rs.getString(5));
                    //
                    std.add(s);
                }//while
                DislayObject(std);
            }

            //
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void DislayObject(ArrayList<Mobile> std) {
        for (Mobile s:std) {
            System.out.println(s.toString());
        }
    }
}
