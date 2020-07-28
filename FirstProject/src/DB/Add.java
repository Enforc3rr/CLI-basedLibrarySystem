package DB;
import java.sql.*;

public class Add {
    String NameofBook;
    String AuthorOfBook;
    String genre;
    int year;
    private int c = 100;


    static Connection conn;
    static Statement st;
    static PreparedStatement pst;
    static {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Library","root","gtaplayer01");
            st = conn.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public  void Add (String NameofBook, String AuthorOfBook, String genre,int year) throws SQLException {
        this.NameofBook = NameofBook;
        this.AuthorOfBook = AuthorOfBook;
        this.genre = genre;
        this.year = year;
//        st.executeUpdate("insert into LibTable" + "set id = c" + "set name = NameofBook" + "set Author = AuthorOfBook" + "set yearofpublication = year" + "set genre = genre");
        pst = conn.prepareCall("insert into LibTable(?,?,?,?,?)");
        pst.setInt(1,c);
        pst.setString(2,NameofBook);
        pst.setString(3,AuthorOfBook);
        pst.setInt(4,year);
        pst.setString(5,genre);
        c = c + 1;
    }
}
