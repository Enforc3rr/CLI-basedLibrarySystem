package DB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Admin {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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


//    public static List<String> adminUsername() throws SQLException {
//        ArrayList<String> userName = new ArrayList<>();
//        ResultSet rs = st.executeQuery("select username from administration");
//        while (rs.next())
//        {
//            userName.add(rs.getString("username"));
//        }
//        return userName;
//
//    }
//    public static List<String> adminPassword() throws SQLException {
//        ResultSet rs = st.executeQuery("select * from administration");
//        ArrayList<String> userPass = new ArrayList<>();
//        while (rs.next()) {
//            userPass.add(rs.getString("password"));
//
//        }
//        return userPass;
//    }

    public static void AdminAdd() throws SQLException {
        try  {
            System.out.print("Enter Name of Book -> ");
            String name = br.readLine();
            System.out.println();
            System.out.print("Enter Author of Book ->  ");
            String author = br.readLine();
            System.out.println();
            System.out.print("Enter Genre of Book ->  ");
            String genre = br.readLine();
            System.out.println();
            System.out.print("Enter year of Publication ->  ");
            int year = Integer.parseInt(br.readLine());
            System.out.println();
            Add a = new Add();
            a.Add(name, author, genre, year);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void AdminRemove()  {
        try  {
            int remove = Integer.parseInt(br.readLine());
            st.executeUpdate("delete from LibTable where Id =('"+remove+"')");
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

    }
    public static void AdminSignUp(){
        try  {
            System.out.print("Enter UserName -> ");
            String userName  = br.readLine();
            System.out.println();
            System.out.print("Enter PassWord->  ");
            String userPassword  = br.readLine();
            st.executeUpdate("insert into administration(username,password) VALUE ('"+userName+" ' ,'" +userPassword+"')");
        } catch ( IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
