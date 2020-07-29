package DB;

import java.sql.*;

public class Info {


    ResultSet rs ;
    static Connection conn;
    static Statement st;

    static {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Library","root","gtaplayer01");
            st = conn.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public  void InfoBooks () throws  SQLException{
        rs = st.executeQuery("select * from LibTable");
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();


// Iterate through the data in the result set and display it.

        while (rs.next()) {
//Print one row
            for(int i = 1 ; i <= columnsNumber; i++){

                System.out.println(rs.getString(i) + " "); //Print one element of a row

            }

            System.out.println();

        }

    }

}


