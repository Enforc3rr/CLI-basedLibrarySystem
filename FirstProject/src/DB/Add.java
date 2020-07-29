package DB;
import java.sql.*;

public class Add {
    String NameofBook;
    String AuthorOfBook;
    String genre;
    int year;
//    private int c = 100;


    static Connection conn;
    static Statement st;
    static PreparedStatement pst;
    static {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Library","root","pass");
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
        st.executeUpdate("insert into LibTable(name,Author,yearofpublication,genre) value ('"+NameofBook+"','"+AuthorOfBook+"','"+year+"','"+genre+"')" );

    }
}
