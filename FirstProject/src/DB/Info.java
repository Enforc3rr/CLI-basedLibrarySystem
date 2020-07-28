package DB;

import java.sql.*;

public class Info {


    ResultSet rs ;
    static Connection conn;
    static Statement st;

    static {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Library","root","pass");
            st = conn.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public  ResultSet InfoBooks () throws  SQLException{
        rs = st.executeQuery("select * from LibTable");
        return rs;
    }

}


