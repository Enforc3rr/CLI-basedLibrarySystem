package Application;
import menu.*;
import DB.*;
import java.io.IOException;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {
            Menu.menuOptions();
            int option = Menu.optionNumber();
            switch(option) {
                case 1: {
                    Info info = new Info();
                    info.InfoBooks();
                    break;

                }
                case 2:
                {
                    AdminOther.AdminOther();
                    break;
                }
                case 3:
                {
                    Admin.AdminSignUp();
                    break;
                }
                default:
                {
                    System.out.println("Exiting...");
                    break;
                }
            }

    }
}
